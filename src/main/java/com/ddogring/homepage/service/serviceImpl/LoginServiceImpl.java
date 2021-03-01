package com.ddogring.homepage.service.serviceImpl;

import com.ddogring.homepage.mapper.UserMapper;
import com.ddogring.homepage.model.User;
import com.ddogring.homepage.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author DdogRing
 * @date 2021/2/28 16:41
 * @description
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean login(User user) {
        String username = user.getUsername();
        String password = user.getPassword();

        // 获取当前对象
        Subject subject = SecurityUtils.getSubject();
        // 将用户名密码封装进token
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);

        try {
            // 利用token登录
            subject.login(token);
            return true;
        } catch (IncorrectCredentialsException e){
            new RuntimeException("密码错误");
            return false;
        } catch (UnknownAccountException e) {
            new RuntimeException("用户名不存在");
            return false;
        } catch (AuthenticationException e) {
            new RuntimeException("该用户不存在");
            return false;
        }
    }
}
