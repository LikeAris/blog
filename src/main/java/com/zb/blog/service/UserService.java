package com.zb.blog.service;

import com.zb.blog.pojo.User;
import org.springframework.stereotype.Service;

/**
 * DESC: UserService
 * DateTime: 2020/11/4 000411:54
 *
 * @author 张彪
 * @version 1.0
 */

public interface UserService {
    /**
     * 用户登录
     */
    User login(User record);
    /**
     * 用户注册
     */
    int register(User record);
}
