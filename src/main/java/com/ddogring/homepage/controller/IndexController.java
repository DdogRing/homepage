package com.ddogring.homepage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author DdogRing
 * @date 2021/2/11 0011 22:23
 * @description
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Integer userId){

        return "index";
    }

    @RequestMapping("/diary")
    public String b(){
        return "diary";
    }

    @RequestMapping("/link")
    public String c(){
        return "link";
    }

    @RequestMapping("/message")
    public String d(){
        return "message";
    }

    @RequestMapping("/read")
    public String e(){
        return "read";
    }


    @RequestMapping("/f")
    public String f(){
        return "a";
    }

}
