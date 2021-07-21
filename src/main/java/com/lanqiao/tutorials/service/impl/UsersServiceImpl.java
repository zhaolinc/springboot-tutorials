package com.lanqiao.tutorials.service.impl;

import com.lanqiao.tutorials.mapper.UsersMapper;
import com.lanqiao.tutorials.model.Users;
import com.lanqiao.tutorials.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 赵林
 * @date 2021/7/16 17:11
 **/
@Service("usersService")
@Transactional(propagation = Propagation.SUPPORTS, rollbackFor = Exception.class)
public class UsersServiceImpl implements IUsersService {
    @Autowired
    UsersMapper usersMapper;
    @Override
    public Users selectForLogin(Users user) {
        return this.usersMapper.selectForLogin(user);
    }
}
