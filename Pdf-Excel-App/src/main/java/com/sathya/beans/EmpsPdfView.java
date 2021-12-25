package com.sathya.beans;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
@Component("pdfview")
public class EmpsPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Map<String,Object>> employeesList=(List<Map<String,Object>>)model.get("employees");
		Paragraph  p=new Paragraph();
		p.add("The below are the details of the employees from Database");
		p.setAlignment("center");
		document.add(p);
		
		Table  table=new Table(4); //4 columns in table
		table.addCell("EMPNO");  table.addCell("ENAME");  table.addCell("SALARY");  table.addCell("DEPTNO");
		for(Map<String,Object>  emp: employeesList) {
			table.addCell(((BigDecimal)emp.get("empno")).toString());
			table.addCell((String)emp.get("ename"));
			table.addCell(((BigDecimal)emp.get("sal")).toString());
			table.addCell(((BigDecimal)emp.get("deptno")).toString());
		}
		table.setAlignment("center");
		document.add(table);
	}
}
