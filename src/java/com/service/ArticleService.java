/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.service;

import com.dao.IDAOArticle;
import com.model.Article;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Dell
 */

@Service
public class ArticleService implements IArticleService{
    
    @Autowired
    private IDAOArticle articleDao;
    
    public void setArticleDao(IDAOArticle articleDao) {
        this.articleDao = articleDao;
    }

    @Override
    @Transactional
    public void addArticle(Article art) {
        this.articleDao.addArticle(art);
    }

    @Override
    @Transactional
    public List<Article> getAll() {
      return   this.articleDao.getAll();
    }

    @Override
    @Transactional
    public Article getArticle(int idArticle) {
       return  this.articleDao.getArticle(idArticle);
    }

    @Override
    @Transactional
    public void updateArticle(Article art) {  
        this.articleDao.updateArticle(art);
    
    }

    @Override
    @Transactional
    public void deleteArticle(Article art) {
        this.articleDao.deleteArticle(art);
    }
}
