package com.sathya.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sathya.dao.IEmpDao;
//test
//merge test
@Controller
public class DocumentController {
	@Autowired
	private  IEmpDao  dao;
	
	@GetMapping("/pdf")
	public  ModelAndView  handlePdf() {
		List<Map<String,Object>>  employeesList=dao.getEmployees();
		return  new  ModelAndView("pdfview","employees",employeesList);
	}
	

	@GetMapping("/excel/bittu")
	public  ModelAndView  handleExcel() {
		List<Map<String,Object>>  employeesList=dao.getEmployees();
		return  new  ModelAndView("excelview","employees",employeesList);
	}

	@GetMapping("/excel/test2")
	public  ModelAndView  handleExcelTest2() {
		List<Map<String,Object>>  employeesList=dao.getEmployees();
		return  new  ModelAndView("excelview","employees",employeesList);
	}
}
