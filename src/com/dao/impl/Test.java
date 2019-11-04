package com.dao.impl;

import com.pojo.Tuser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TuserDaoImpl ud;
		try {
			ud = (TuserDaoImpl) Class.forName("com.dao.impl.TuserDaoImpl").newInstance();
			Tuser u1=ud.login("1");
			System.out.println(u1);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
