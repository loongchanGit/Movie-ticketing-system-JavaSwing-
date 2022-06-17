package com.crc.service;


import java.util.List;

import com.crc.entity.Ticket;

public interface TicketService {
		 
	public boolean addTicket(Ticket ticket) ;
	public boolean delTicket(int tId) ;
	public List<Ticket> queryAllTicket();
	public List<Ticket> queryAllTicketsId(int sId);	
	public List<Ticket> queryAllTicketuId(int uId);
}
