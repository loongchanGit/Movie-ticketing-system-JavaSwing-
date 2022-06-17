package com.crc.service;

import java.util.List;

import com.crc.entity.Session;

public interface SessionService {
	public int addSession(Session session);
    public boolean delSession(int sId);
    public boolean updateSession(Session session);
    public Session querySessionById(int sId);
    public List<Session> queryAllSession();
    public List<Session> querySessionBymId(int mId);
    public List<Session> querySessionByHid(int hId);
    public List<Session> querySessionBycIdandmId(int cId,int mId);
    public List<Session> querySessionBycId(int cId);
}
