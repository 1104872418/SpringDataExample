package com.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.data.entity.User;
import com.data.service.UserService;

@Controller    // 表示这是一个Controller
@RequestMapping(path="/spring") // 访问url从Application/spring/开始
public class UserController {
	
    @Autowired
    private UserService userService;

    @GetMapping(path="/add") // “/add”路径映射到addNewUser方法上
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email) {
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userService.insertUser(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // 返回一个json类型的user
        return userService.findAll();
    }
}