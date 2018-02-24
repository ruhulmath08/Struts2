/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruhul.dao;

import com.ruhul.pojo.Userlogin;
import com.ruhul.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Ruhul-Pc
 */
public class UserLoginDao {
    
    private String username;
    private String password;
    //for save data in database
    public void add(Userlogin userlogin) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(userlogin);
        session.getTransaction().commit();
        session.close();
    }

    //for check username and password
    public boolean checkUser() {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query query = session.createQuery("from userlogin where username=:username and password=:password");
            query.setString("username", username);
            query.setString("password", password);
            List list = query.list();
            System.out.println("list size " + list.size());
            if (list.size() == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
