package com.brightson.usercenter.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {
    private Integer userId;
    private String userCoce;
    private String userName;
}
