package com.example.demo.listener;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.devtools.restart.RestartApplicationListener;
import org.springframework.context.ApplicationListener;

/**
 * @Project : spring_boot2.0
 * @Date : 2018-03-19
 * @Author : nklee
 * @Description :
 */
public class MyListener2 implements ApplicationListener<ApplicationPreparedEvent> {


    @Override
    public void onApplicationEvent(ApplicationPreparedEvent applicationPreparedEvent) {
        System.out.println("Application is prepared!!!");
    }
}
