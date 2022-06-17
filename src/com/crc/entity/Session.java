package com.crc.entity;

import java.util.Date;

public class Session {
	int sId;//场次id
	int hId;//场厅id
	int cId;//影院id
	int mId;//电影id
	Date beginTime;//开始时间
	double price;//价格
	int remain;//剩余座位

	public Session() {
		super();
		// TODO Auto-generated constructor stub
	}
	




	public Session(int hId, int cId, Date beginTime, double price, int remain) {
		super();
		this.hId = hId;
		this.cId = cId;
		this.beginTime = beginTime;
		this.price = price;
		this.remain = remain;
	}





	public Session(int sId) {
		super();
		this.sId = sId;
	}





	public Session(int hId, int cId, int mId, Date beginTime, double price, int remain) {
		super();
		this.hId = hId;
		this.cId = cId;
		this.mId = mId;
		this.beginTime = beginTime;
		this.price = price;
		this.remain = remain;
	}





	public Session(int sId, int hId, int cId, int mId, Date beginTime, double price, int remain) {
		super();
		this.sId = sId;
		this.hId = hId;
		this.cId = cId;
		this.mId = mId;
		this.beginTime = beginTime;
		this.price = price;
		this.remain = remain;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public int gethId() {
		return hId;
	}

	public void sethId(int hId) {
		this.hId = hId;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	

	public Date getBeginTime() {
		return beginTime;
	}


	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRemain() {
		return remain;
	}

	public void setRemain(int remain) {
		this.remain = remain;
	}


	@Override
	public String toString() {
		return "Session [sId=" + sId + ", hId=" + hId + ", cId=" + cId + ", mId=" + mId + ", beginTime=" + beginTime
				+ ", price=" + price + ", remain=" + remain + "]";
	}

}
