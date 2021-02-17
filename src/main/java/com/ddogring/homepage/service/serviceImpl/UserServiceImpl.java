package com.ddogring.homepage.service.serviceImpl;

import com.ddogring.homepage.mapper.UserMapper;
import com.ddogring.homepage.model.User;
import com.ddogring.homepage.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author DdogRing
 * @date 2021/2/17 0017 10:03
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int delete(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public User getByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int modifyByPrimaryKey(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User getUser(String username) {
        return userMapper.getUserByUsername(username);
    }
}
