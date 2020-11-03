package com.zb.blog.controller;

import com.zb.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DESC: ArticleController
 * DateTime: 2020/11/3 000311:04
 *
 * @author 张彪
 * @version 1.0
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    /**
     * 查询所有文章
     */
    @RequestMapping("/getAllArticle")
    public void getAllArticle(Integer userId){
        articleService.getAllArticle(userId);
    }
}
