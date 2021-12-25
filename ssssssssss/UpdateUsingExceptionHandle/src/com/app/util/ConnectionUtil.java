package com.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","scott","tiger");
			return con;
		}
		catch(ClassNotFoundException |SQLException sqle) {
			sqle.printStackTrace();
			}
		return null;
	}

}
