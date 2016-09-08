package com.register.service;
 
import com.register.Dao.UserRegisterDao;
import com.register.model.UserRegister;
 
public class UserRegisterServiceImpl implements UserRegisterService {
    private UserRegisterDao userdao;
     
 
 
    public void setUserRegisterdao(UserRegisterDao userdao) {
        this.userdao = userdao;
    }
 

    @Override
    public int save(UserRegister user) {
        
        return userdao.save(user);
    }
 
}