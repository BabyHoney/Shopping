package com.zhf.shopping.rabbitmq.service;

import com.alibaba.fastjson.JSON;
import com.zhf.shopping.rabbitmq.config.RabbitConfig;
import com.zhf.shopping.rabbitmq.entity.SysLog;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoggerService {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void log(SysLog sysLog) {
        rabbitTemplate.convertAndSend(RabbitConfig.queueName, JSON.toJSONString(sysLog));
    }
}
