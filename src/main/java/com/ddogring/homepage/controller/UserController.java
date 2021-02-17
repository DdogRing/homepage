package com.ddogring.homepage.controller;

import com.ddogring.homepage.model.User;
import com.ddogring.homepage.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @author DdogRing
 * @date 2021/2/16 0016 23:23
 * @description 用户控制器
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUser(Model model){

        User user = userService.getUser("DdogRing");
        model.addAttribute("user", user);
        System.out.println(user);
        return "index";
    }
}
