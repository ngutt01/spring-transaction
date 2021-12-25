package com.sathya.beans;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsView;
@Component("excelview")
public class EmpXlsView extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<Map<String,Object>> employeesList=(List<Map<String,Object>>)model.get("employees");
		Sheet  sh=workbook.createSheet("Employees Sheet");
		Row  r0=sh.createRow(0);
		Cell c0=r0.createCell(0);
		Cell c1=r0.createCell(1);
		Cell c2=r0.createCell(2);
		Cell c3=r0.createCell(3);
		c0.setCellValue("EMPNO");
		c1.setCellValue("ENAME");
		c2.setCellValue("SALARY");
		c3.setCellValue("DEPTNO");
		int rowIndex=1;
		for(Map<String,Object>  emp:employeesList) {
			Row  r= sh.createRow(rowIndex);
			Cell ce1=r.createCell(0);
			Cell ce2=r.createCell(1);
			Cell ce3=r.createCell(2);
			Cell ce4=r.createCell(3);
			ce1.setCellValue(((BigDecimal)emp.get("empno")).toString());
			ce2.setCellValue((String)emp.get("ename"));
			ce3.setCellValue(((BigDecimal)emp.get("sal")).toString());
			ce4.setCellValue(((BigDecimal)emp.get("deptno")).toString());
			rowIndex++;
		}
	}
}
