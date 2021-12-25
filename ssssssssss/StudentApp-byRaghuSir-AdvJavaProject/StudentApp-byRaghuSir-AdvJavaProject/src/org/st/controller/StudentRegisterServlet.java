package org.st.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.st.dao.IStudentDao;
import org.st.dao.fact.StudentDaoFactory;
import org.st.model.Student;

@WebServlet("/stdreg")
public class StudentRegisterServlet 
extends HttpServlet
{

	public void doPost(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, 
					IOException 
	{
		//1. read data
		String sid=req.getParameter("sid");
		String sname=req.getParameter("sname");
		String gen=req.getParameter("gen");
		String dob=req.getParameter("dob");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String addr=req.getParameter("addr");
		//2. parse data
		int id=Integer.parseInt(sid);
		
		//3. create model class obj
		Student s=new Student();

		//4. set data to model obj
		s.setId(id);
		s.setName(sname);
		s.setGen(gen);
		s.setDob(dob);
		s.setEmail(email);
		s.setPhno(mobile);
		s.setAddr(addr);
		
		//5. call DaoFact
		IStudentDao dao=StudentDaoFactory.getDao();
		//6. call save method
		int count=dao.saveStudent(s);
		
		//7. send data from Servlet to UI
		String msg=null;
		if(count==1) {
			msg="Saved successfully";
		}else {
			msg="Not Saved!contact admin";
		}
		req.setAttribute("message", msg);
		//8. Dispatch to Ui
		RequestDispatcher rd=req.getRequestDispatcher("StudentReg.jsp");
		rd.forward(req, resp);
		
	}




}





