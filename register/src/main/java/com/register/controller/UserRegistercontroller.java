package com.register.controller;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.web.servlet.ModelAndView;
 
import com.register.model.UserRegister;
import com.register.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class UserRegistercontroller  {
    
    @Autowired
    UserRegisterService userRegisterService;
   
    @RequestMapping("/adduser")
    public ModelAndView handleRequest(@ModelAttribute("user") UserRegister user ) throws Exception {
        System.out.println("hello");
        
   
        userRegisterService.save(user);
        return new ModelAndView("sucess");
    }
    
    @RequestMapping("/welcome")
    public String welcomeRequest() throws Exception {
        System.out.println("hello");
        
   
        return "welcome";
    }
 
}