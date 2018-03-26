package com.example.demo;

import com.example.demo.configuration.MyPojos;
import com.example.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("prod")
public class DemoApplicationTests {

    @Autowired
    private UserService userService;

    @Value("${name}")
    private String nameValue;
    @Value("${root.prop}")
    private String rootValue;

    @Value("${db.url}")
    private String dbUrl;

    // 콤마를 이용한 properties value 참조
    @Value("${corsHostsAllow}")
    private String[] corsHostsAllow;

    @Autowired
    private MyPojos MyPojos;

    @Autowired
    private Environment environment;


	@Test
	public void contextLoads() {
	    assertNotNull(userService);
	}

	@Test
	public void properties테스트() {
        System.out.println(nameValue);
        System.out.println(rootValue);
        System.out.println(dbUrl);
        System.out.println(Arrays.toString(corsHostsAllow));
        System.out.println(MyPojos.getList());

        System.out.println(environment.getProperty("mypojo.list[0].name"));
    }
}
