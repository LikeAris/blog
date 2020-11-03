package com.zb.blog.service;

import com.zb.blog.pojo.Article;

import java.util.List;

/**
 * DESC: ArticleService
 * DateTime: 2020/11/3 000310:59
 *
 * @author 张彪
 * @version 1.0
 */
public interface ArticleService {

    /**
     * 根据用户id查询所有文章
     *
     */
    List<Article> getAllArticle(Integer userId);
}
