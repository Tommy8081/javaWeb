package com.service.impl;

import com.dao.ITuserDao;
import com.dao.impl.TuserDaoImpl;
import com.pojo.Tuser;
import com.service.ITuserService;
import com.tools.*;

public class TuserServiceImpl implements ITuserService {

	//里氏代换原则
	private ITuserDao ud;
	
	public TuserServiceImpl() {
		DL d=DL.getdl();
		this.ud=(ITuserDao) d.getobj("tuserdao");
	}
	
	@Override
	public String login(String uname, String upwd) {
		// TODO Auto-generated method stub
		Tuser u=ud.login(uname,upwd);
		if (u==null) {
			return "{\"msg\":\"error\"}";
		} else {
			return u.toString();
		}
		
	}

}
