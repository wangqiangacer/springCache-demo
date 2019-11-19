package com.jacken.springcachedemo.service;

import com.jacken.springcachedemo.domain.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Cacheable(cacheNames = {"test"})
    public User getUser(Integer id){
        System.out.println("查询数据库获取用户信息");
        User user = new User();
        user.setId(id);
        user.setName("xiaoming");
        return user;
    }
    @CacheEvict(cacheNames = {"test"},key = "#id")
    public  void  delete(Integer id){

        System.out.println("删除用户信息"+id);
    }
}
