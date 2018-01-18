package com.xyt.sample.rabbitmq.provider;

import com.xyt.sample.rabbitmq.provider.fanout.FanoutSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 摘要:
 *
 * @author xyt
 * @create 2018-01-18 下午8:55
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class FanoutTest {

    @Autowired
    private FanoutSender sender;

    @Test
    public void fanoutSender() throws Exception {
        sender.send();
    }


}