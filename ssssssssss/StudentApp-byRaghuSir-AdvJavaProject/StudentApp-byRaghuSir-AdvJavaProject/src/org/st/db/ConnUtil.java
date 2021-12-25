package org.st.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnUtil {

	private static Connection con=null;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sathya", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConn(){
		return con;
	}
	
	
}


