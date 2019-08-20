package com.brightson.usercenter.bean.user;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name="t_user")
public class UserDo {
    @Id
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "user_code")
    private String userCode;
    @Column(name = "user_name")
    private String userName;
}
