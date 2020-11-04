package com.zb.blog.service.impl;

import com.zb.blog.dao.UserMapper;
import com.zb.blog.pojo.User;
import com.zb.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * DESC: UserServiceImpl
 * DateTime: 2020/11/4 000411:56
 *
 * @author 张彪
 * @version 1.0
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(User record) {
        return userMapper.selectByUserMessage(record);
    }

    @Override
    public int Register(User record) {
        return userMapper.insertSelective(record);
    }
}
