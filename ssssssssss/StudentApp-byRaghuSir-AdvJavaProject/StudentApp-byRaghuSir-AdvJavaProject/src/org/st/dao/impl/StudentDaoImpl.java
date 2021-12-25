package org.st.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.st.dao.IStudentDao;
import org.st.db.ConnUtil;
import org.st.model.Student;

public class StudentDaoImpl 
implements IStudentDao
{

	@Override
	public int saveStudent(Student s) {
		int count=0;
		String sql="insert into stdtab values(?,?,?,?,?,?,?)";
		try {
			//1. create conn
			Connection con=ConnUtil.getConn();
			//2. preapre Stmt
			PreparedStatement pstmt=con.prepareStatement(sql);
			//3. set data to pstmt
			pstmt.setInt(1, s.getId());
			pstmt.setString(2, s.getName());
			pstmt.setString(3, s.getGen());
			pstmt.setString(4, s.getDob());
			pstmt.setString(5, s.getEmail());
			pstmt.setString(6, s.getPhno());
			pstmt.setString(7, s.getAddr());
			//4. execut SQL
			count=pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public List<Student> getAllStudents() {
		//1. SQL query
		String sql="select * from stdtab";
		List<Student> stds=null;
		try {
			//Get Connection
			Connection con=ConnUtil.getConn();
			//Prepare Stmt
			PreparedStatement pstmt=con.prepareStatement(sql);
			//execute sql
			ResultSet rs=pstmt.executeQuery();
			stds=new ArrayList<>();
			//while method exected for no.of rows
			while(rs.next()) {
				//add to collection
				stds.add(
						//convert to Model class obj
						new Student(
								//reading one row data
								rs.getInt(1),
								rs.getString(2),
								rs.getString(3),
								rs.getString(4),
								rs.getString(5),
								rs.getString(6),
								rs.getString(7))
						);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		//rows converted to List<Student>
		return stds;
	}
	
	
	@Override
	public void deleteStudent(int id) {
		String sql="delete from stdtab where id=?";   
		try {
			Connection con=ConnUtil.getConn();
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
