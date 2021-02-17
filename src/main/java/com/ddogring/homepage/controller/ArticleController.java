package com.ddogring.homepage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author DdogRing
 * @date 2021/2/16 0016 23:08
 * @description 博客控制器
 */
@Controller
public class ArticleController {

    @RequestMapping("/article")
    public String articleInfo(){
        return "article";
    }
}
