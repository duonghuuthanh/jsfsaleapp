/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dht.services;

import com.dht.pojo.Product;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author duonghuuthanh
 */
public class ProductServices {
    private final static SessionFactory factory = HibernateUtils.getFACTORY();
    
    public List<Product> getProducts(String kw) {
        return null;
    }
    
    public Product getProductById(int id) {
        try (Session session = factory.openSession()) {
            return session.get(Product.class, id);
        }
    }
    
}
