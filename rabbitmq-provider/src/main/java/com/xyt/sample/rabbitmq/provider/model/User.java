package com.xyt.sample.rabbitmq.provider.model;

import java.io.Serializable;

/**
 * 摘要:
 *
 * @author xyt
 * @create 2018-01-18 下午8:21
 **/

public class User implements Serializable {

    private String name;

    private String pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}