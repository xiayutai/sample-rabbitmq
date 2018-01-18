package com.xyt.sample.rabbitmq.provider.object;

import com.xyt.sample.rabbitmq.provider.model.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 摘要:
 *
 * @author xyt
 * @create 2018-01-18 下午8:33
 **/

@Component
public class ObjectSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(User user) {
        System.out.println("Sender object: " + user.toString());
        this.rabbitTemplate.convertAndSend("object", user);
    }

}