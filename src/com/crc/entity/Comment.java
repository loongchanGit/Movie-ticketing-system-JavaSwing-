package com.crc.entity;

import java.util.Date;

public class Comment {
	private int conId;//id
	private int uId;//用户id
	private int mId;//电影id
	private String comment;//评论内容
	private Date comtime;//日期
  
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public Comment(int uId, int mId, String comment, Date comtime) {
		super();
		this.uId = uId;
		this.mId = mId;
		this.comment = comment;
		this.comtime = comtime;
	}
	

	public Comment(int uId, int mId) {
		super();
		this.uId = uId;
		this.mId = mId;
	}

	public int getConId() {
		return conId;
	}

	public void setConId(int conId) {
		this.conId = conId;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getComtime() {
		return comtime;
	}

	public void setComtime(Date comtime) {
		this.comtime = comtime;
	}

	@Override
	public String toString() {
		return "Comment [conId=" + conId + ", uId=" + uId + ", mId=" + mId + ", comment=" + comment + ", comtime="
				+ comtime + "]";
	}
    
}
