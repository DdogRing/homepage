package com.ddogring.homepage.service;

import com.ddogring.homepage.model.User;

/**
 * @author DdogRing
 * @date 2021/2/28 16:39
 * @description 登录服务
 */
public interface LoginService {

    boolean login(User user);
}
