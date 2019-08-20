package com.brightson.usercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableFeignClients
@MapperScan("com.brightson.*.mapper")
public class UserServiceApp {
    public static void main(String[] args){
        SpringApplication.run(UserServiceApp.class, args);
    }
}
