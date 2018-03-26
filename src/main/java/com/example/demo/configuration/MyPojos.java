package com.example.demo.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Project : spring_boot2.0
 * @Date : 2018-03-26
 * @Author : nklee
 * @Description :
 */
@Component
@ConfigurationProperties(prefix="mypojo")
public class MyPojos {

    private List<MyPojo> list;

    public List<MyPojo> getList() {
        return list;
    }

    public void setList(List<MyPojo> list) {
        this.list = list;
    }
}