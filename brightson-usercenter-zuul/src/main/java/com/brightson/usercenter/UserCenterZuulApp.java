package com.brightson.usercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class UserCenterZuulApp {
    public static void main(String[] args) {
        SpringApplication.run(UserCenterZuulApp.class, args);
    }
}
