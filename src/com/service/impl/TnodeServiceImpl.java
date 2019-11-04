package com.service.impl;

import java.util.List;

import com.dao.ITnodeDao;
import com.service.ITnodeService;
import com.tools.*;

public class TnodeServiceImpl implements ITnodeService {

	private ITnodeDao td;
	
	public TnodeServiceImpl() {
		DL d=DL.getdl();
		this.td=(ITnodeDao) d.getobj("tnodedao");
	}
	
	@Override
	public String getbyuid(String uid) {
		// TODO Auto-generated method stub
		List l=td.getbyuid(uid);
		String s="[";
		for (int i = 0; i < l.size(); i++) {
			s+=l.get(i).toString()+",";
		}
		s=s.substring(0, s.length()-1);
		s+="]";
		return s;
	}

}
