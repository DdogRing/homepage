package com.ddogring.homepage.controller;

import com.ddogring.homepage.model.User;
import com.ddogring.homepage.service.LoginService;
import com.ddogring.homepage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @ClassName LoginController
 * @Author DdogRing
 * @Date 2021/2/23 0023 21:58
 * @Description 登录控制器
 * @Version 1.0
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private UserService userService;

    /**
     * 跳转登录页面
     * @author DdogRing
     * @date 2021/2/23 0023 21:59
     * @param
     * @return java.lang.String
     */
    @RequestMapping(value = {"/toLogin", "index", "/"})
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(User user, Model model){
        Map<String, Object> loginMap = loginService.login(user);
        return "index";
    }
}
