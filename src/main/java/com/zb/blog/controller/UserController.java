package com.zb.blog.controller;

import com.zb.blog.pojo.User;
import com.zb.blog.service.UserService;
import com.zb.blog.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DESC: UserController
 * DateTime: 2020/11/4 000414:54
 *
 * @author 张彪
 * @version 1.0
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public Result login(User record){
        return Result.success(userService.login(record));
    }
    @RequestMapping("register")
    public Result register(User record){
        return Result.success(userService.register(record));
    }

}
