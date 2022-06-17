package com.crc.dao;

import java.util.List;

import com.crc.entity.Ticket;

public interface TicketDao {
    public boolean addTicket(Ticket ticket);
    public boolean delTicket(int tId);
    public List<Ticket> queryAllTicket();
    public List<Ticket> queryAllTicketsId(int sId);
    public List<Ticket> queryAllTicketuId(int uId);
}
