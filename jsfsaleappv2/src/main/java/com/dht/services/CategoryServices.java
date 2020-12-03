/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dht.services;

import com.dht.pojo.Category;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author duonghuuthanh
 */
public class CategoryServices {
    private final static SessionFactory factory = HibernateUtils.getFACTORY();
    
    public List<Category> getCates() {
        try (Session session = factory.openSession()) {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery query = builder.createQuery();
            Root<Category> root = query.from(Category.class);
            
            query = query.select(root);
            
            Query q = session.createQuery(query);
            
            return q.getResultList();
        }
    }
}
