package org.st.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.st.dao.IStudentDao;
import org.st.dao.fact.StudentDaoFactory;
import org.st.model.Student;

@WebServlet("/all")
public class StudentViewAllServlet 
	extends HttpServlet
{
	public void doGet(
			HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, 
					IOException 
	{
		//get Dao Object using Factory
		IStudentDao dao=StudentDaoFactory.getDao();
		//call method
		List<Student> stds=dao.getAllStudents();
		//send data to UI
		req.setAttribute("list", stds);
		
		//move to JSP page
		RequestDispatcher rd=req.getRequestDispatcher("StudentData.jsp");
		rd.forward(req, resp);
		
	}
	
	
}





