/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dht.bean;

import com.dht.pojo.Category;
import com.dht.pojo.Manufacturer;
import com.dht.service.CategoryService;
import com.dht.service.ManufacturerService;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author duonghuuthanh
 */
@ManagedBean
@Named(value = "cateBean")
@SessionScoped
public class CateBean implements Serializable {
    private final static CategoryService cateService = new CategoryService();
    private final static ManufacturerService manuService = new ManufacturerService();

    /**
     * Creates a new instance of CateBean
     */
    public CateBean() {
    }
    
    public List<Category> getCategories() {
        return cateService.getCategories();
    }
    
    public List<Manufacturer> getManufacturers() {
        return manuService.getManufacturers();
    }
}
