package com.ddogring.homepage.service;

import com.ddogring.homepage.model.Article;

import java.util.List;

/**
 * @author DdogRing
 * @date 2021/3/1 13:32
 * @description 文章博客服务
 */
public interface ArticleService {

    int removeByUserId(Integer id);

    int addUser(Article article);

    Article getById(Integer id);

    int modify(Article article);

    List<Article> getAllArticle();
}
