package com.zb.blog.service.impl;

import com.zb.blog.dao.UserMapper;
import com.zb.blog.pojo.User;
import com.zb.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DESC: UserServiceImpl
 * DateTime: 2020/11/4 000411:56
 *
 * @author 张彪
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(User record) {
        return userMapper.selectByUserMessage(record);
    }

    @Override
    public int register(User record) {
        return userMapper.insertSelective(record);
    }
}
