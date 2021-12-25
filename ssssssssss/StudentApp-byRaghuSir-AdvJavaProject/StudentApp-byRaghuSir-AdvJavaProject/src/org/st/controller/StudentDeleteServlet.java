package org.st.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.st.dao.IStudentDao;
import org.st.dao.fact.StudentDaoFactory;

@WebServlet("/delete")
public class StudentDeleteServlet 
	extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sid=req.getParameter("id");
		int id=Integer.parseInt(sid);
		
		IStudentDao dao=StudentDaoFactory.getDao();
		dao.deleteStudent(id);
		
		//get all servlet
		req.getRequestDispatcher("/all")
		.forward(req, resp);
		
		
		
	}
}
