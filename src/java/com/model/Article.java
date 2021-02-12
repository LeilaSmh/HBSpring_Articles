/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model;

import javax.persistence.*;

/**
 *
 * @author Dell
 */

@Entity
@Table(name="ARTICLE")
public class Article {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private int code;
    @Column
    private String designation;
    @Column
    private double prix;

    public Article() {
    }

	
    public Article(int code) {
        this.code = code;
    }
    
    public Article(int code, String designation, double prix) {
        this.code = code;
        this.designation = designation;
        this.prix = prix;
    }
  
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}


