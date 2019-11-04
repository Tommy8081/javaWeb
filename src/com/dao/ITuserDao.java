package com.dao;

import com.pojo.Tuser;

public interface ITuserDao {

	public Tuser login(String uname,String upwd);
	
	public Tuser login(String uid);
	
	
	
}
