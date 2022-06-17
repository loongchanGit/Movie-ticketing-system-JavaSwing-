package com.crc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.crc.dao.CinemaDao;
import com.crc.entity.Cinema;

public class CinemaDaoImpl extends BaseDao implements CinemaDao {
	//添加影院
	@Override
	public boolean addCinema(Cinema cinema) {
		// TODO Auto-generated method stub
		if (cinema == null) {//空值判断
			return false;
		}
		String sql="insert into cinema (cname,caddress) values(?,?)";
		List<Object> params1 = new ArrayList<Object>();//参数集合
		params1.add(cinema.getCname());//参数
		params1.add(cinema.getCaddress());//参数
		return operUpdate(sql, params1);//修改
	}
	//删除影院
	@Override
	public boolean delCinema(int cId) {
		// TODO Auto-generated method stub
		String sql = "delete from cinema where cId=" + cId;
		return operUpdate(sql, null);//修改
	}
	//修改影院信息
	@Override
	public boolean updateCinema(Cinema cinema) {
		// TODO Auto-generated method stub
		String sql = "update cinema set cname=?,caddress=? where cId=?";
		List<Object> params1 = new ArrayList<Object>();//参数集合
		params1.add(cinema.getCname());//设置参数
		params1.add(cinema.getCaddress());
		params1.add(cinema.getCid());
		return operUpdate(sql, params1);//修改
	}
	//查找所有影院
	@Override
	public List<Cinema> queryAllCinema() {
		// TODO Auto-generated method stub
		String sql = "select * from cinema";
		List<Cinema> list=null;
		try {
			list = operQuery(sql, null, Cinema.class);//查询结果
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;//返回结果
	}
	//查找指定影院
	@Override
	public Cinema queryCinemaById(int cId) {
		// TODO Auto-generated method stub
		String sql ="select * from cinema where cId="+cId;
		List<Cinema> list=null;//结果集合
		try {
			list = operQuery(sql, null,Cinema.class);//查询结果
			if (list.size() == 0) {
				return null;
			} else {
				return list.get(0);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//模糊查询影院名字
	@Override
	public List<Cinema> queryCinemaByCinemaName(String cName) {
		// TODO Auto-generated method stub
		String name="'%";
		for(int i = 0; i < cName.length(); i++) {
			name += cName.charAt(i)+"%";
		}
		name+="'";
		String sql="select * from cinema where cName like"+name;
		List<Cinema> list=null;
		try {
			list = operQuery(sql,null,Cinema.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	//模糊查询影院地址
	@Override
	public List<Cinema> queryCinemaByCinemaAddress(String cAddress) {
		// TODO Auto-generated method stub
		String address="'%";
		for(int i = 0; i < cAddress.length(); i++) {
			address += cAddress.charAt(i)+"%";//拼凑通配符
		}
		address+="'";
		String sql="select * from cinema where cAddress like"+address;
		List<Cinema> list=null;
		try {
			list = operQuery(sql,null,Cinema.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	//模糊查询影院名字和影院地址
	@Override
	public List<Cinema> queryCinemaByCinemaNameAndCinemaAddress(String cName, String cAddress) {
		// TODO Auto-generated method stub
		String address="'%";
		for(int i = 0; i < cAddress.length(); i++) {
			address += cAddress.charAt(i)+"%";//拼凑通配符
		}
		address+="'";
		String name="'%";
		for(int i = 0; i < cName.length(); i++) {
			name += cName.charAt(i)+"%";
		}
		name+="'";

		String sql="select * from cinema where cName like"+name+"and cAddress like"+address;
		List<Cinema> list=null;
		try {
			list = operQuery(sql,null,Cinema.class);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	//根据影院名字和地址查询
	@Override
	public Cinema queryCinema(Cinema cinema) {
		// TODO Auto-generated method stub
		String sql = "select * from cinema where cName=? and cAddress=? ";
		List<Object> params = new ArrayList<Object>();//结果集合
		params.add(cinema.getCname());//设置参数
		params.add(cinema.getCaddress());
		List<Cinema> list=null;
		try {
			list = operQuery(sql,params,Cinema.class);//查找
			if(list.size() == 0){
				return null;
			}else{
				return list.get(0);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
   
}
