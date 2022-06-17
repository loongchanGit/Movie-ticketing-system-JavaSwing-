package com.crc.entity;

public class Cinema {

	private int cId;//id
	private String cName;//影院名
	private String cAddress;//影院地址
	public Cinema(String cname, String caddress) {
		super();
		this.cName = cname;
		this.cAddress = caddress;
	}
	
	public Cinema(int cId, String cName, String cAddress) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cAddress = cAddress;
	}

	public Cinema() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cId;
	}
	public void setCid(int cid) {
		this.cId = cid;
	}
	public String getCname() {
		return cName;
	}
	public void setCname(String cname) {
		this.cName = cname;
	}
	public String getCaddress() {
		return cAddress;
	}
	public void setCaddress(String caddress) {
		this.cAddress = caddress;
	}

	@Override
	public String toString() {
		return "Cinema [cid=" + cId + ", cname=" + cName + ", caddress=" + cAddress + "]";
	}
	

}
