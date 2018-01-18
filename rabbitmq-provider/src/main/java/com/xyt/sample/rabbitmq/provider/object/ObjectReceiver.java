package com.xyt.sample.rabbitmq.provider.object;

import com.xyt.sample.rabbitmq.provider.model.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 摘要:
 *
 * @author xyt
 * @create 2018-01-18 下午8:33
 **/

@Component
@RabbitListener(queues = "object")
public class ObjectReceiver {

    @RabbitHandler
    public void process(User user) {
        System.out.println("Receiver object : " + user);
    }

}