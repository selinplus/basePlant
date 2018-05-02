package com.interstore.basePlant.domain;

import lombok.Data;

@Data
public class Role {

	private int id;
    private String name;
    private String description;
    
    public Role(String name,String description) {
    	this.name = name;
    	this.description = description;
    }
}
