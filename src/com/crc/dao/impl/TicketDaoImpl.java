package com.crc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.crc.dao.TicketDao;
import com.crc.entity.Ticket;

public class TicketDaoImpl extends BaseDao implements TicketDao{
//添加电影票
	@Override
	public boolean addTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		if(ticket==null) {
			System.out.println("are you kiding me?");
			return false;
		}
		String sql="insert into ticket (uId,sId,seat) values(?,?,?)";
		List<Object> params1 = new ArrayList<Object>();
		params1.add(ticket.getuId());
		params1.add(ticket.getsId());
		params1.add(ticket.getSeat());
		
		return operUpdate(sql, params1);
	}
//删除电影票
	@Override
	public boolean delTicket(int tId) {
		// TODO Auto-generated method stub
		String sql="delete from ticket where tId="+tId;
		return operUpdate(sql, null);
	}
//查询所有电影票
	@Override
	public List<Ticket> queryAllTicket() {
		// TODO Auto-generated method stub
		String sql="select * from ticket";
		List<Ticket> list=null;
		try {
			list = operQuery(sql, null,Ticket.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
//根据场次id查询所有电影票
	@Override
	public List<Ticket> queryAllTicketsId(int sId) {
		// TODO Auto-generated method stub
		String sql="select * from ticket where sId="+sId;
		List<Ticket> list=null;
		try {
			list = operQuery(sql, null,Ticket.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
//根据用户id查询电影票
	@Override
	public List<Ticket> queryAllTicketuId(int uId) {
		// TODO Auto-generated method stub
		String sql="select * from ticket where uId="+uId;
		List<Ticket> list=null;
		try {
			list = operQuery(sql, null,Ticket.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
