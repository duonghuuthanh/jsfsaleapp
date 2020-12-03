/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dht.bean;

import com.dht.pojo.Category;
import com.dht.services.CategoryServices;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author duonghuuthanh
 */
@ManagedBean
@Named(value = "homeBean")
@RequestScoped
public class HomeBean {

    /**
     * Creates a new instance of HomeBean
     */
    public HomeBean() {
    }
    
    public List<Category> getCategories() {
        return new CategoryServices().getCates();
    }
}
