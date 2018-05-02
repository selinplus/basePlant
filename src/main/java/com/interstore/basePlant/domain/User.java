package com.interstore.basePlant.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class User {

	private Long id;
    
    private String username;
    
    private String password;
    
    private String name;
    
    private List<Role> roles;

    private String provider;
    
    private String company;
    
    private Date createDate;
    
    private Date modifyDate;
    
    private String deptId;
    
    private String phone;
    
    public User(String username,String password,List<Role> roles) {
    	this.username = username;
    	this.password = password;
    	this.roles = roles;
    }
}
