package com.app.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.app.util.ConnectionUtil;

public class TestStatement {
	public void getData() {
		try {
			Connection con=ConnectionUtil.getConnection();
			String sql="select * from emp";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				for (int i=1;i<9;i++) {
				System.out.println("the table is:"+rs.getString(i));
				//System.out.println("empId:" + rs.getInt(1) + " " + "empName:" + rs.getString(2));
				}
			}
			con.close();
			}
	
		catch(SQLException e) {
			e.printStackTrace();
		}

	}
	
}	