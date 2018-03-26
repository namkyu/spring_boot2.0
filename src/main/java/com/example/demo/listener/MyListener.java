package com.example.demo.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Project : spring_boot2.0
 * @Date : 2018-03-19
 * @Author : nklee
 * @Description :
 */
public class MyListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("Application is Started!!");
    }
}
