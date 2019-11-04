package com.dao.impl;

import java.util.List;

import com.dao.ITkDao;
import com.pojo.Tk;

public class TkDaoImpl implements ITkDao {

	@Override
	public List getall() {
		// TODO Auto-generated method stub
		String sql="select * from tk";
		return DH.getall(sql, new Tk(), new String[] {});
	}

	@Override
	public Tk getbyid(String id) {
		// TODO Auto-generated method stub
		String sql="select * from tk where id=?";
		List l=DH.getall(sql, new Tk(), new String[] {id});
		return (Tk) l.get(0);
	}

}
