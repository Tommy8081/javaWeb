package com.dao.impl;

import java.util.List;

import com.dao.ITnodeDao;
import com.pojo.Tnode;

public class TnodeDaoImpl implements ITnodeDao {

	@Override
	public List getbyuid(String uid) {
		// TODO Auto-generated method stub
		String sql="select * from tnode where id in(select nid from trn where rid in(select rid from tur where uid=?))";
		return DH.getall(sql, new Tnode(), new String[] {uid});
	}

}
