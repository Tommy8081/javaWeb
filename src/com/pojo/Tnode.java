package com.pojo;

import java.io.Serializable;

public class Tnode implements Serializable {

	private int id;
	
	private String menutext;
	
	private String url;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMenutext() {
		return menutext;
	}

	public void setMenutext(String menutext) {
		this.menutext = menutext;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="{\"id\":\""+this.id+"\",\"menutext\":\""+this.menutext+"\",\"url\":\""+this.url+"\"}";
		return s;
	}
	
	
	
}
