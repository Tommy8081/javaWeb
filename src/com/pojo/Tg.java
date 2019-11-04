package com.pojo;

import java.io.Serializable;

public class Tg implements Serializable {

	private int id;
	
	private String gname;
	
	private int gage;
	
	private String gxb;
	
	private String ztype;
	
	private String znum;
	
	private int kid;
	
	private String kname;
	
	private String gtype;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public int getGage() {
		return gage;
	}

	public void setGage(int gage) {
		this.gage = gage;
	}

	public String getGxb() {
		return gxb;
	}

	public void setGxb(String gxb) {
		this.gxb = gxb;
	}

	public String getZtype() {
		return ztype;
	}

	public void setZtype(String ztype) {
		this.ztype = ztype;
	}

	public String getZnum() {
		return znum;
	}

	public void setZnum(String znum) {
		this.znum = znum;
	}

	public int getKid() {
		return kid;
	}

	public void setKid(int kid) {
		this.kid = kid;
	}

	public String getKname() {
		return kname;
	}

	public void setKname(String kname) {
		this.kname = kname;
	}

	public String getGtype() {
		return gtype;
	}

	public void setGtype(String gtype) {
		this.gtype = gtype;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="{\"id\":\""+this.id+"\",\"gname\":\""+this.gname+"\",\"gage\":\""+this.gage+"\",\"gxb\":\""+this.gxb+"\",\"ztype\":\""+this.ztype+"\",\"znum\":\""+this.znum+"\",\"kid\":\""+this.kid+"\",\"kname\":\""+this.kname+"\",\"gtype\":\""+this.gtype+"\"}";
		return s;
	}
	
	
	
}
