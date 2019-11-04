package com.pojo;

import java.io.Serializable;

public class Tk implements Serializable {

	private int id;
	
	private String kname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKname() {
		return kname;
	}

	public void setKname(String kname) {
		this.kname = kname;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="{\"id\":\""+this.id+"\",\"kname\":\""+this.kname+"\"}";
		return s;
	}
	
	
	
}
