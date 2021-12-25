package com.app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.app.util.ConnectionUtil;

public class JdbcProgram {

	//Read 
	public void getData() {

		try {
			Connection con = ConnectionUtil.getConnection();
			String sql = "select * from emp";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				System.out.println("empId:" + rs.getInt(1) + " " + "empName:" + rs.getString(2));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//write
	public void updateData() {
		
		try {
			Connection con = ConnectionUtil.getConnection();
			String sql = "update emp set ename = 'Rahul' where empno = '7369' ";
			Statement st = con.createStatement();
			System.out.println("------------------------Before Update-------------------");
			getData();
			int effectedRow = st.executeUpdate(sql);
			System.out.println("row updated :"+effectedRow);
			System.out.println("------------------------After Update-------------------");
			getData();			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
