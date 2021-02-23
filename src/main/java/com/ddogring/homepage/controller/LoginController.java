package com.ddogring.homepage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName LoginController
 * @Author DdogRing
 * @Date 2021/2/23 0023 21:58
 * @Description 登录控制器
 * @Version 1.0
 */
@Controller
public class LoginController {

    /**
     * 跳转登录页面
     * @author DdogRing
     * @date 2021/2/23 0023 21:59
     * @param
     * @return java.lang.String
     */
    @RequestMapping({"/toLogin"})
    public String toLogin(){
        return "login";
    }
}
