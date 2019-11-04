package com.dao.impl;

import java.util.List;

import com.dao.ITuserDao;
import com.pojo.Tuser;

public class TuserDaoImpl implements ITuserDao {

	@Override
	public Tuser login(String uname, String upwd) {
		// TODO Auto-generated method stub
		String sql="select * from tuser where uname=? and upwd=?";
		List l=DH.getall(sql, new Tuser(), new String[] {uname,upwd});
		if (l.size()==0) {
			return null;
		} else {
			return (Tuser) l.get(0);
		}
		
	}

	@Override
	public Tuser login(String uid) {
		// TODO Auto-generated method stub
		String sql="select * from tuser where id=?";
		List l=DH.getall(sql, new Tuser(), new String[] {uid});
		return (Tuser) l.get(0);
	}

}
