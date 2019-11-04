package com.dao.impl;

import com.dao.ITgDao;
import com.pojo.Tg;

public class TgDaoImpl implements ITgDao {

	@Override
	public Boolean save(Tg g) {
		// TODO Auto-generated method stub
		try {
			String sql="insert into tg(gname,gage,gxb,ztype,znum,kid,kname,gtype) values(?,?,?,?,?,?,?,?)";
			DH.update(sql, new String[] {g.getGname(),g.getGage()+"",g.getGxb(),g.getZtype(),g.getZnum(),g.getKid()+"",g.getKname(),g.getGtype()});
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}
	}

}
