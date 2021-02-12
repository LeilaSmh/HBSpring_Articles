/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.service;

import com.model.Article;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface IArticleService {
    public  void addArticle(Article art);
    public  List<Article> getAll();
    public  Article getArticle(int idArticle) ;
    public  void updateArticle(Article art);
    public  void deleteArticle(Article art) ;
}
