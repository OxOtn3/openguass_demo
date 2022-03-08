package com.vurtne.controller;

import com.vurtne.entity.User;
import com.vurtne.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author oxotn3
 * @create 2022-03-08
 * @description
 */
@RestController
@RequestMapping("/api")
public class DemoController {
    @Resource
    UserService userService;

    @RequestMapping("/demo")
    @ResponseBody
    public List<User> getUser(){
        return userService.getUser();
    }
}
