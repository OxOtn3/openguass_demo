package com.vurtne.service.impl;

import com.vurtne.entity.User;
import com.vurtne.mapper.UserMapper;
import com.vurtne.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author oxotn3
 * @create 2022-03-08
 * @description
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public List<User> getUser() {

        return userMapper.getUser();
    }
}
