package com.itlsc.controller;

import com.itlsc.common.Result;
import com.itlsc.entity.User;
import com.itlsc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody User user){
        User u = userService.login(user);
        if(u!=null){
            return Result.success(u);
        }
        return Result.error("用户名或密码错误");
    }

}
