package com.interstore.basePlant.pojos;

import java.util.List;

import lombok.Data;
@Data
public class UserPojo {

	private String username;
	private List<Integer> roleId;
	private String deptId;
}
