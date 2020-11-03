package com.zb.blog.service.impl;

import com.zb.blog.dao.ArticleMapper;
import com.zb.blog.pojo.Article;
import com.zb.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DESC: ArticleServiceImpl
 * DateTime: 2020/11/3 000311:01
 *
 * @author 张彪
 * @version 1.0
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;
    @Override
    public List<Article> getAllArticle(Integer userId) {
        System.out.println(articleMapper.getAllArticle(userId));
        return articleMapper.getAllArticle(userId);
    }
}
