package org.st.dao.fact;

import org.st.dao.IStudentDao;
import org.st.dao.impl.StudentDaoImpl;

public class StudentDaoFactory {

	public static IStudentDao getDao() {
		StudentDaoImpl dao=new StudentDaoImpl();
		return dao;
	}
}








