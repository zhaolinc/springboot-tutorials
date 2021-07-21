package com.lanqiao.tutorials.mapper;

import com.lanqiao.tutorials.model.Users;
import org.apache.ibatis.annotations.Mapper;

/**
* @Entity com.lanqiao.tutorials.model.Users
*/
@Mapper
public interface UsersMapper{

    public Users selectForLogin(Users user);
}
