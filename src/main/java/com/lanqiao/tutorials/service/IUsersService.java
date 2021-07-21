package com.lanqiao.tutorials.service;

import com.lanqiao.tutorials.model.Users;

public interface IUsersService {
    public Users selectForLogin(Users user);
}
