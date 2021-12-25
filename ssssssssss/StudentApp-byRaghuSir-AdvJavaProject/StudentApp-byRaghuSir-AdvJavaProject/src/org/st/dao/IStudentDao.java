package org.st.dao;

import java.util.List;

import org.st.model.Student;

public interface IStudentDao {
	int saveStudent(Student s);
	List<Student> getAllStudents();
	void deleteStudent(int id);
}








