package com.wrd.blog.Service;

import com.wrd.blog.Dao.ArticleMapper;
import com.wrd.blog.Entity.Article;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleService {
    @Resource
    ArticleMapper articleMapper;
    public List<Article> fingall(int page){
        articleMapper.selectByExampleWithBLOBs(null);
    }
}
