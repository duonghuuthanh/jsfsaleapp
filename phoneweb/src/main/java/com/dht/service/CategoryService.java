/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dht.service;

import com.dht.phoneweb.HibernateUtil;
import com.dht.pojo.Category;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author duonghuuthanh
 */
public class CategoryService {
    private final static SessionFactory factory = HibernateUtil.getFactory();
    
    public List<Category> getCategories() {
        try (Session session = factory.openSession()) {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Category> query = builder.createQuery(Category.class);
            Root<Category> root = query.from(Category.class);
            query.select(root);
            
            return session.createQuery(query).getResultList();
        }
    }
    
    public Category getCategoryById(int cateId) {
        try (Session session = factory.openSession()) {
            return session.get(Category.class, cateId);
        }
    }
}
