package com.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	public static Connection getConnection() {
		// 1
		// Class.forName("oracle.jdbc.driver.OracleDriver");
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			// 2 ojdbc14.jar => jdbc:oracle:thin:@localhost:1521:xe =>oralce10g
			// ojdbc6.jar => jdbc:oracle:thin:@//localhost:1521/orcl =>oralce11g
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl", "scott", "tiger");
			// 3
			return con;

		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

		return null;
	}

}
