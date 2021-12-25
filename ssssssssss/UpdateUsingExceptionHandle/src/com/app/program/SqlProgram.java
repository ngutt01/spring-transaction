package com.app.program;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.app.util.ConnectionUtil;

public class SqlProgram {
	public void runSqlProgram() {
	try {
	Connection conn=ConnectionUtil.getConnection();
	String sql="select * from dept";
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery(sql);
    while(rs.next()) {
    	System.out.println("Output Result:"+rs.getInt(1)+"-------"+rs.getString(2)+"------"+rs.getString(3));
    }
    conn.close();
    }
	catch (SQLException sqle) {
		sqle.printStackTrace();
	}
	}
}
