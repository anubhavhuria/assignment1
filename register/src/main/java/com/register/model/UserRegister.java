package com.register.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table
public class UserRegister {
    @Id
    @GeneratedValue
    private int UserId;
    @Column
    private String Name;
    @Column
    private String Password;
    @Column
    private String email;
    
    public int getUserId() {
        return UserId;
    }
    public void setUserId(int UserId) {
        this.UserId = UserId;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "User [UserId=" + UserId + ", Name=" + Name
                + ", Password="+Password+ ", email=" + email + "]";
    }
     
     
     
 
}