/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.Article;
import com.service.ArticleService;
import com.service.IArticleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Dell
 */
@Controller
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }

    @RequestMapping(value = "/")
    public String getAll(Model model) {
        List<Article> list = this.articleService.getAll();
        model.addAttribute("list", list);
        model.addAttribute("article", new Article());
        return "articles";
    }

    @RequestMapping("/edit/{code}")
    public String editArticle(@PathVariable("code") int code, Model model) {
        model.addAttribute("action", "edit");
        model.addAttribute("article", this.articleService.getArticle(code));
        return "article";
    }

    @RequestMapping(value = "/article/update", method = RequestMethod.POST)
    public String updateArticle(@RequestParam("operation") String op,
            @ModelAttribute("article") Article art, BindingResult result,Model model) {
        if (result.hasErrors()) {
            return "error";
        } else {
            if (op == "edit") {
                this.articleService.updateArticle(art);
            } else if (op == "add") {
                this.articleService.addArticle(art);
                System.out.println("add article");
            }
        }
        return "/";
    }

    @RequestMapping("/delete/{code}")
    public String deleteArticle(@PathVariable("code") int code) {
        this.articleService.deleteArticle(this.articleService.getArticle(code));
        return "redirect:/";
    }

    @RequestMapping(value = "/article/add")
    public String addArticle(Model model) {
        model.addAttribute("action", "add");
        model.addAttribute("article", new Article());
        return "article";
    }
//
}
