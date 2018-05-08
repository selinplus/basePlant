package com.interstore.basePlant.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Dept {

	private String id;

	private String name;
	
	private boolean standalone;
	
	private boolean customer;
	
	private Date createdDate;
	
	private Date modifyDate;
	
	private String parentId;
}
