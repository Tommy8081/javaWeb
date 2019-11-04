package com.service.impl;

import java.util.List;

import com.dao.ITkDao;
import com.service.ITkService;
import com.tools.DL;

public class TkService implements ITkService {

	private ITkDao td;
	
	public TkService() {
		DL d=DL.getdl();
		this.td=(ITkDao) d.getobj("tkdao");
	}
	
	@Override
	public String getall() {
		// TODO Auto-generated method stub
		List l=td.getall();
		String s="[";
		for (int i = 0; i < l.size(); i++) {
			s+=l.get(i).toString()+",";
		}
		s=s.substring(0, s.length()-1);
		s+="]";
		return s;
	}

}
