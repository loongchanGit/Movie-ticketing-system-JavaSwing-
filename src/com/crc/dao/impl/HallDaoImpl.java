package com.crc.dao.impl;

import java.util.ArrayList;
import java.util.List;
import com.crc.dao.HallDao;
import com.crc.entity.Hall;

public class HallDaoImpl extends BaseDao implements HallDao{
//添加场厅
	@Override
	public boolean addHall(Hall hall) {
		// TODO Auto-generated method stub
		if(hall==null) {
			return false;
		}
		String sql="insert into hall (hName,cId,capacity) values (?,?,?)";
		List<Object> params1 = new ArrayList<Object>();
		params1.add(hall.gethName());
		params1.add(hall.getcId());
		params1.add(hall.getCapacity());
		return operUpdate(sql, params1);
	}
//删除场厅
	@Override
	public boolean delHall(int hId) {
		// TODO Auto-generated method stub
		String sql = "delete from hall where hId=" + hId;
		return operUpdate(sql, null);
	}
//修改场厅
	@Override
	public boolean updateHall(Hall hall) {
		// TODO Auto-generated method stub
		String sql = "update hall set hName=?,cId=?,capacity=? where hId=?";
		List<Object> params1 = new ArrayList<Object>();
		params1.add(hall.gethName());
		params1.add(hall.getcId());
		params1.add(hall.getCapacity());
		params1.add(hall.gethId());
		return operUpdate(sql, params1);
	}
//查询所有场厅
	@Override
	public List<Hall> queryAllHall() {
		// TODO Auto-generated method stub
		String sql = "select * from hall";
		List<Hall> list=null;
		try {
			list = operQuery(sql, null, Hall.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
//根据id查询场厅
	@Override
	public Hall queryHallById(int hId) {
		// TODO Auto-generated method stub
		String sql ="select * from hall where hId="+hId;
		List<Object> params = new ArrayList<Object>();
		List<Hall> list=null;
		try {
			list = operQuery(sql, null,Hall.class);
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
//查询影院id查询场厅
	@Override
	public List<Hall> queryAllHallcId(int cId) {
		// TODO Auto-generated method stub
		String sql="select * from hall where cId="+cId;
		List<Hall> list=null;
		try {
			list = operQuery(sql, null,Hall.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
//查询场厅
	@Override
	public Hall queryHall(Hall hall) {
		// TODO Auto-generated method stub
		String sql="select * from hall where hName=? and cId=? and capacity=?";
		List<Object> params = new ArrayList<Object>();
		params.add(hall.gethName());
		params.add(hall.getcId());
		params.add(hall.getCapacity());
		List<Hall> list=null;
		try {
			list = operQuery(sql,params,Hall.class);			
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
