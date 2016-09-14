package com.register.service;

import com.register.Dao.UserRegisterDao;
import com.register.model.UserRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterServiceImpl implements UserRegisterService {

    @Autowired
    private UserRegisterDao userRegisterDao;

    /**
     *
     * @param user
     */
    @Override
    public int save(UserRegister user) {

        return userRegisterDao.save(user);
    }

    public void setUserDAO(UserRegisterDao userdao) {
        this.userRegisterDao = userdao;
    }
}
