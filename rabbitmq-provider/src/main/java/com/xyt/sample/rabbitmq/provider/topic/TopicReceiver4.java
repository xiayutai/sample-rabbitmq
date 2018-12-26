package com.xyt.sample.rabbitmq.provider.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 摘要:
 *
 * @author xyt
 * @create 2018-01-18 下午8:34
 **/

@Component
@RabbitListener(queues = "des.file.rp.done")
public class TopicReceiver4 {

    @RabbitHandler
    public void process(String fileStatusNotice) {
        System.out.println("Topic Receiver  : " + fileStatusNotice);
    }

}