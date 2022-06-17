package com.crc.service;

import java.util.List;

import com.crc.entity.Cinema;

public interface CinemaService {
	public int addCinema(Cinema cinema);
	public boolean delCinema(int cid);
	public boolean updateCinema(Cinema cinema);
	public List<Cinema> queryAllCinema();
	public Cinema queryCinemaById(int cId);
	public List<Cinema> queryCinemaByCinemaName(String cName);
	public List<Cinema> queryCinemaByCinemaAddress(String cAddress);
	public List<Cinema> queryCinemaByCinemaNameAndCinemaAddress(String cName, String cAddress);
}
