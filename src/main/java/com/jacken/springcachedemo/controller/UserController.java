package com.jacken.springcachedemo.controller;

import com.jacken.springcachedemo.domain.User;
import com.jacken.springcachedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        return userService.getUser(id);
    }
    @RequestMapping("/user/delete/{id}")
    public  void  deleteUser(@PathVariable("id") Integer id){
        userService.delete(id);
    }
    @RequestMapping("/remove")
    public  String removeCache(){
        userService.removeCache();
        return "success";
    }
}
