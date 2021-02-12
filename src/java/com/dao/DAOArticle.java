/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Article;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Dell
 */
public class DAOArticle implements IDAOArticle {

    private SessionFactory sessionFactory;

    public DAOArticle(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addArticle(Article art) {
        Session S = this.sessionFactory.getCurrentSession();
        S.persist(art);
    }

    @Override
    public void updateArticle(Article art) {
        Session S = this.sessionFactory.getCurrentSession();
        S.update(art);
    }

    @Override
    @Transactional
    public List<Article> getAll() {
        @SuppressWarnings("unchecked")
        List<Article> list = null;
        try {
            Session S = this.sessionFactory.getCurrentSession();
            list = (List<Article>) S.createQuery("from Article").list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    @Override
    public Article getArticle(int idArticle) {
        Session S = this.sessionFactory.getCurrentSession();
        Article art = (Article) S.load(Article.class, new Integer(idArticle));
        return art;
    }

    @Override
    public void deleteArticle(Article art) {
        Session S = this.sessionFactory.getCurrentSession();
        S.delete(art);
    }

}
