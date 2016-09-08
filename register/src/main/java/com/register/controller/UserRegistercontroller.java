package com.register.controller;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
 
import com.register.model.UserRegister;
import com.register.service.UserRegisterService;
 
public class UserRegistercontroller implements Controller {
    private UserRegisterService userservice;
    public void setUserRegisterservice(UserRegisterService userservice) {
        this.userservice = userservice;
    }
    public UserRegistercontroller() {
        // TODO Auto-generated constructor stub
        System.out.println("helloworld");
    }
    
    public ModelAndView handleRequest(HttpServletRequest request,
            HttpServletResponse response ) throws Exception {
        System.out.println("hello");
        String name = request.getParameter("fname");
 
        String password = request.getParameter("pass");
         
        String email = request.getParameter("email");
     
        UserRegister u = new UserRegister();
         
        u.setName(name);
        u.setPassword(password);
        u.setEmail(email);
        userservice.save(u);
        return new ModelAndView("sucess");
    }
 
}