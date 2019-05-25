package com.zhf.shopping.exception;

public class BasicException extends RuntimeException {

    private Integer code;

    // 给子类用的方法
    public BasicException(ResponseCodeEnum responseCodeEnum) {
        this(responseCodeEnum.getMessage(), responseCodeEnum.getCode());
    }

    private BasicException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
