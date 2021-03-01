package com.ddogring.homepage.service.serviceImpl;

import com.ddogring.homepage.mapper.ArticleMapper;
import com.ddogring.homepage.model.Article;
import com.ddogring.homepage.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DdogRing
 * @date 2021/3/1 13:32
 * @description 文章博客服务
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public int removeByUserId(Integer id) {
        return 0;
    }

    @Override
    public int addUser(Article article) {
        return 0;
    }

    @Override
    public Article getById(Integer id) {
        return null;
    }

    @Override
    public int modify(Article record) {
        return 0;
    }

    @Override
    public List<Article> getAllArticle() {
        return articleMapper.selectArticleList();
    }
}
