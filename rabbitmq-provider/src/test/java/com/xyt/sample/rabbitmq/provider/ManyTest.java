package com.xyt.sample.rabbitmq.provider;

import com.xyt.sample.rabbitmq.provider.many.NeoSender;
import com.xyt.sample.rabbitmq.provider.many.NeoSender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 摘要:
 *
 * @author xyt
 * @create 2018-01-18 下午8:57
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyTest {
    @Autowired
    private NeoSender neoSender;

    @Autowired
    private NeoSender2 neoSender2;

    @Test
    public void oneToMany() throws Exception {
        for (int i=0;i<100;i++){
            neoSender.send(i);
        }
    }

    @Test
    public void manyToMany() throws Exception {
        for (int i=0;i<100;i++){
            neoSender.send(i);
            neoSender2.send(i);
        }
    }

}