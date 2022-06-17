package com.crc.dao;

import com.crc.entity.User;

public interface UserDao {
	public boolean addUser(User user);
	public boolean delUser(int uid);
	public boolean updateUser(User user);
	public boolean updateUserPass(User user ,String pass);
	public User queryUser(User user);
	public User queryUserByName(String uName);
	public User queryUserByid(int uid);
}
