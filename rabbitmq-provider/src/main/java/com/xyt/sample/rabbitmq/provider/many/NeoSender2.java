package com.xyt.sample.rabbitmq.provider.many;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 摘要:
 *
 * @author xyt
 * @create 2018-01-18 下午8:31
 **/

@Component
public class NeoSender2 {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(int i) {
        String context = "spirng boot neo queue"+" ****** "+i;
        System.out.println("Sender2 : " + context);
        this.rabbitTemplate.convertAndSend("neo", context);
    }

}