package com.brightson.usercenter.service;

import com.brightson.usercenter.bean.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="userservice")
public interface UserService {
    /**
     * 插入用户
     * @param userDTO
     * @return
     */
    @RequestMapping(value="/insertUser")
    Integer insertUser(@RequestBody UserDTO userDTO);

    /**
     * 更新用户
     * @param userDTO
     * @return
     */
    @RequestMapping("/updateUser")
    Integer updateUser(@RequestBody UserDTO userDTO);

    /**
     * 删除用户
     * @param userDTO
     * @return
     */
    @RequestMapping("/deleteUser")
    Integer deleteUser(@RequestBody UserDTO userDTO);

    /**
     * 根据Id查询用户信息
     * @param userId
     * @return
     */
    @RequestMapping("/getUserById")
    UserDTO getUserById(@RequestParam("user_id") Integer userId);
}
