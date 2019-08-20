package com.brightson.usercenter.service.userimpl;

import com.brightson.usercenter.bean.UserDTO;
import com.brightson.usercenter.bean.user.UserDo;
import com.brightson.usercenter.mapper.UserMapper;
import com.brightson.usercenter.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public Integer insertUser(UserDTO userDTO) {
        UserDo userDo = new UserDo();
        BeanUtils.copyProperties(userDTO, userDo);
        return userMapper.insert(userDo);
    }

    @Override
    public Integer updateUser(UserDTO userDTO) {
        UserDo userDo = new UserDo();
        BeanUtils.copyProperties(userDTO, userDo);
        return userMapper.updateByPrimaryKeySelective(userDo);
    }

    @Override
    public Integer deleteUser(UserDTO userDTO) {
        UserDo userDo = new UserDo();
        BeanUtils.copyProperties(userDTO, userDo);
        return userMapper.deleteByPrimaryKey(userDo);
    }

    @Override
    public UserDTO getUserById(Integer userId) {
        UserDo userDO = new UserDo();
        userDO.setUserId(userId);
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(userMapper.selectByPrimaryKey(userDO),userDTO);

        return userDTO;
    }
}
