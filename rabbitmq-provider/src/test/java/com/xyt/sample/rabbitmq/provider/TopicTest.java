package com.xyt.sample.rabbitmq.provider;

import com.xyt.sample.rabbitmq.provider.topic.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 摘要:
 *
 * @author xyt
 * @create 2018-01-18 下午8:53
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicTest {

    @Autowired
    private TopicSender sender;

    @Test
    public void topic() throws Exception {
        sender.send();
    }

    @Test
    public void topic1() throws Exception {
        sender.send1();
    }

    @Test
    public void topic2() throws Exception {
        sender.send2();
    }

}