package com.baizhi.service;

public interface UserService {
    public void register();

    public void register(String username, String password);

    public void delete();

    public void update();
}
