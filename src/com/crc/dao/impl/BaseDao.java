package com.crc.dao.impl;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BaseDao {

	public static final String DRIVER = "com.mysql.jdbc.Driver";//驱动名
	public static final String URL = "jdbc:mysql://localhost:3306/db_moview_ticket?useUnicode=true&characterEncoding=utf-8";//数据库链接地址

	// 加载驱动，只需加载一次
	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 获得连接
	public Connection getConn() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, "root", "lr18020737930");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	// 关闭所有
	public void releaseAll(ResultSet rs, PreparedStatement pstmt, Connection conn) {

		try {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 增删改 封装
	public boolean operUpdate(String sql, List<Object> params) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int res = 0;
		// 获得与数据库的连接对象
		conn = getConn();
		try {
			pstmt = conn.prepareStatement(sql);//执行sql语句
			if (params != null) {
				for (int i = 0; i < params.size(); i++) {
					pstmt.setObject(i + 1, params.get(i));//参数集合
				}
			}
			// 增刪改的統一方法
			res = pstmt.executeUpdate();
			//返回的是sql在数据库中影响的行数
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			releaseAll(null, pstmt, conn);
		}

		return res > 0 ? true : false;

	}

	public <T> List<T> operQuery(String sql, List<Object> params, Class<T> cls) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<T> list = new ArrayList<T>();
		conn = getConn();//获取连接

		try {
			pstmt = conn.prepareStatement(sql);//执行sql
			if (params != null) {
				for (int i = 0; i < params.size(); i++) {
					pstmt.setObject(i + 1, params.get(i));//获取参数到集合
				}

			}
			// 增刪改的統一方法
			rs = pstmt.executeQuery();//查询
			ResultSetMetaData rsmd = rs.getMetaData();
			while (rs.next()) {
				T m = cls.newInstance();
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					String col_name = rsmd.getColumnName(i + 1);//获取列名
					Object value = rs.getObject(col_name);//获取列值
					Field field;
					field = cls.getDeclaredField(col_name);//获取类本身的属性成员
					field.setAccessible(true);//此对象的 accessible 标志设置为true
					field.set(m, value);
				}
				list.add(m);
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			releaseAll(rs, pstmt, conn);
		}
		return list;

	}

}
