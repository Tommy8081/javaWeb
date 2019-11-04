package com.tools;

import java.util.HashMap;
import java.util.Map;

public class DL {

	private DL() {
		this.m1=new HashMap<String,String>();
		this.m1.put("tuserdao", "com.dao.impl.TuserDaoImpl");
		this.m1.put("tuserservice", "com.service.impl.TuserServiceImpl");
		this.m1.put("tnodedao", "com.dao.impl.TnodeDaoImpl");
		this.m1.put("tnodeservice", "com.service.impl.TnodeServiceImpl");
		this.m1.put("tkdao", "com.dao.impl.TkDaoImpl");
		this.m1.put("tkservice", "com.service.impl.TkService");
		this.m1.put("tgdao", "com.dao.impl.TgDaoImpl");
		this.m1.put("tgservice", "com.service.impl.TgService");
		
	}
	
	private static DL d;
	
	public static synchronized DL getdl() {
		if (d==null) {
			d=new DL();
		}
		return d;
	}
	
	private Map<String,String> m1;
	
	public Object getobj(String key) {
		String uri=this.m1.get(key);
		Object o1;
		try {
			o1=Class.forName(uri).newInstance();
			return o1;
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
}
