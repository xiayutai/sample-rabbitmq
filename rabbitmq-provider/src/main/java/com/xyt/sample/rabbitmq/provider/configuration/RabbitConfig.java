package com.xyt.sample.rabbitmq.provider.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 摘要:
 *
 * @author xyt
 * @create 2018-01-18 下午8:15
 **/

@Configuration
public class RabbitConfig {

    @Bean
    public Queue Queue() {
        return new Queue("hello");
    }

}