package com.baizhi.service;

import org.springframework.stereotype.Service;

@Service  //原始类
public class UserServiceImpl implements UserService {
    @Override
    public void register() {
        System.out.println("我是注册方法");
    }

    @Override
    public void register(String username, String password) {
        System.out.println("我是带有两个参数的注册方法");
    }

    @Override
    public void delete() {
        System.out.println("我是删除方法");
    }

    @Override
    public void update() {
        System.out.println("我是修改方法");
    }
}
