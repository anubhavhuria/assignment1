/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.register.Dao;

 
import com.register.model.UserRegister;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
/**
 *
 * @author anubhav
 */
@Repository
public class UserRegisterDaoImpl extends JdbcDaoSupport implements UserRegisterDao {
  
    @Autowired
    private DataSource dataSource;
 
    @PostConstruct
    public void init()
    {
         setDataSource(dataSource);
    }

    @Override
    public int save(UserRegister user) {
        String sql="INSERT INTO UserRegister"
                +"(Name,Password,Email)VALUES(?,?,?)";
        getJdbcTemplate().update(sql, new Object[]{user.getName(), user.getPassword(), user.getEmail()});
        
     return 0;
    }
 
}
    

