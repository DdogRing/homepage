package com.ddogring.homepage.controller;

import org.springframework.stereotype.Controller;

/**
 * @author DdogRing
 * @date 2021/2/11 0011 22:23
 * @description
 */
@Controller("/index")
public class IndexController {

    public String index(){
        return "index";
    }
}
