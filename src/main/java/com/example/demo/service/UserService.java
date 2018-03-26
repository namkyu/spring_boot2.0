package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project : spring_boot2.0
 * @Date : 2018-03-09
 * @Author : nklee
 * @Description :
 */
@Service
public class UserService {

    public String getMessage() {
        return "Hello Spring Boot 2.0";
    }
}
