package com.dao;

import java.util.List;

import com.pojo.Tk;

public interface ITkDao {

	public List getall();
	
	public Tk getbyid(String id);
	
}
