/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.register.Dao.Impl;

import org.springframework.orm.hibernate3.HibernateTemplate;
 
import com.register.Dao.UserRegisterDao;
import com.register.model.UserRegister;
/**
 *
 * @author anubhav
 */
public class UserRegisterDaoImpl implements UserRegisterDao {
    
     private HibernateTemplate hibernatetemplate;
    public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
        this.hibernatetemplate = hibernatetemplate;
    }
 

    @Override
    public int save(UserRegister user) {
        Integer i = (Integer)hibernatetemplate.save(user);
        return i;
    }
 
}
    

