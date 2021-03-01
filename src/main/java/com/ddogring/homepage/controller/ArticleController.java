package com.ddogring.homepage.controller;

import com.ddogring.homepage.constant.Constant;
import com.ddogring.homepage.model.Article;
import com.ddogring.homepage.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author DdogRing
 * @date 2021/2/16 0016 23:08
 * @description 博客控制器
 */
@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/article")
    public String articleInfo(Integer userId, Model model){
        List<Article> articleList = articleService.getAllArticle();
        model.addAttribute(Constant.ARTICLE_LIST, articleList);
        model.addAttribute(Constant.USER_ID, userId);
        return "article";
    }
}
