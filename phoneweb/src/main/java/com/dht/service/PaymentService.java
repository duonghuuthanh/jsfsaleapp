/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dht.service;

import com.dht.phoneweb.HibernateUtil;
import com.dht.pojo.Payment;
import com.dht.pojo.PaymentDetail;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author duonghuuthanh
 */
public class PaymentService {
    private final static SessionFactory factory = HibernateUtil.getFactory();
    
    public boolean addPayment(Payment payment, List<PaymentDetail> details) {
        try (Session session = factory.openSession()) {
            try {
                session.getTransaction().begin();
                
                session.save(payment);
                for (PaymentDetail detail: details)
                    session.save(detail);
                
                session.getTransaction().commit();
                
                return true;
            } catch (Exception ex) {
                session.getTransaction().rollback();
            }
        }
        
        return false;
    }
}
