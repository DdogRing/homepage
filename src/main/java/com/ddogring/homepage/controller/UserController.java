package com.ddogring.homepage.controller;

import com.ddogring.homepage.model.User;
import com.ddogring.homepage.service.UserService;
import com.ddogring.homepage.util.SaltUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

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

        User user = userService.selectByUsername("DdogRing");
        model.addAttribute("user", user);
        System.out.println(user);
        return "index";
    }

    /**
     * 用户注册
     * @author DdogRing
     * @date 2021/2/23 0023 22:04
     * @param user 用户
     * @return java.lang.String
     */
    @RequestMapping("/register")
    @ResponseBody
    public String register(User user){
        // userService.addUser(user);
        return SaltUtil.generateSalt(10);
    }
}
