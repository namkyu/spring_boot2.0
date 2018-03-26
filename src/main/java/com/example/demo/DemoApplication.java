package com.example.demo;

import com.example.demo.listener.MyListener;
import com.example.demo.listener.MyListener2;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
@PropertySource("classpath:db.properties")
@RestController
public class DemoApplication {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String hello() {
        return userService.getMessage();
    }

	public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(DemoApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.addListeners(new MyListener());
        springApplication.addListeners(new MyListener2());
        springApplication.run(args);
    }
}
