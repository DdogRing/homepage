package com.ddogring.homepage.service;

import com.ddogring.homepage.model.User;

/**
 * @author DdogRing
 * @date 2021/2/17 0017 10:02
 * @description 用户服务
 */
public interface UserService {

    // 根据用户id删除用户
    int delete(Integer id);

    // 添加用户
    int addUser(User user);

    // 通过用户id获取用户信息
    User getByPrimaryKey(Integer id);

    // 通过用户id更新用户信息
    int modifyByPrimaryKey(User user);

    // 通过用户名获取用户信息
    User selectByUsername(String username);
}
