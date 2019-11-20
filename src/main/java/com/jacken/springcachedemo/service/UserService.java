package com.jacken.springcachedemo.service;

import com.jacken.springcachedemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private CacheManager cacheManager;

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

    public  String removeCache(){
        cacheManager.getCache("test").clear();
        System.out.println("清空缓存");
        return "success";
    }
}
