package com.service.impl;

import com.dao.ITgDao;
import com.dao.ITkDao;
import com.pojo.Tg;
import com.service.ITgService;
import com.tools.DL;

public class TgService implements ITgService {

	private ITgDao td;
	public TgService() {
		DL d=DL.getdl();
		this.td= (ITgDao) d.getobj("tgdao");
	}
	@Override
	public String save(Tg t) {
		// TODO Auto-generated method stub
		Boolean b=td.save(t);
		if (b) {
			return "{\"msg\":\"success\"}";
		} else {
			return "{\"msg\":\"error\"}";
		}
		
	}

}
