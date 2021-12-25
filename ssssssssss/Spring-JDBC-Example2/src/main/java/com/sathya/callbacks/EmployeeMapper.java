package com.sathya.callbacks;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sathya.model.Employee;

public class EmployeeMapper  implements  RowMapper<Employee> {
	public Employee mapRow(ResultSet rs, int rowIndex) throws SQLException {
		Employee  e=new  Employee();
		e.setEmpno(rs.getInt(1));
		e.setEname(rs.getString(2));
		e.setSal(rs.getInt(3));
		e.setDeptno(rs.getInt(4));
		return e;
	
	}

}
