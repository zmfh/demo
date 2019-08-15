package com.wrd.blog.Controller;

import com.wrd.blog.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ArticleController {
    @Autowired
    ArticleService articleService;
    public String index(){

    }
}
