package com.sathya.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sathya.bean.LoginBean;
import com.sathya.dao.ILoginDao;

@Controller
public class LoginController {
	
	@Autowired
	private  ILoginDao  dao;
	
	@RequestMapping(value="/getLoginPage", method=RequestMethod.GET)
	public   String   getLoginPage(ModelMap  modelMap) {
		LoginBean   loginBean =new LoginBean();
		modelMap.addAttribute("userLogin", loginBean);
		
		return   "login";
	}
	
	@RequestMapping(value="/checkLogin", method=RequestMethod.POST)
	public   String   checkLogin(@Valid @ModelAttribute("userLogin")LoginBean   loginBean, BindingResult  result)
	{
		if(result.hasErrors()) {
			return  "login";
		}
		else {
			String  username=loginBean.getUsername();
			String  password=loginBean.getPassword();
			boolean  flag=dao.verifyUserInDB(username, password);
			if(flag) {
				return  "success";
			}
			else {
				return  "failure";
			}
		}
		
	}
	

	@RequestMapping(value="/checkLoginV1", method=RequestMethod.POST)
	public   String   checkLoginV1(@Valid @ModelAttribute("userLogin")LoginBean   loginBean, BindingResult  result)
	{
		if(result.hasErrors()) {
			return  "login";
		}
		else {
			String  username=loginBean.getUsername();
			String  password=loginBean.getPassword();
			boolean  flag=dao.verifyUserInDB(username, password);
			if(flag) {
				return  "success";
			}
			else {
				return  "failure";
			}
		}
		
		@RequestMapping(value="/checkLoginV2", method=RequestMethod.POST)
		public   String   checkLoginV2(@Valid @ModelAttribute("userLogin")LoginBean   loginBean, BindingResult  result)
		{
			if(result.hasErrors()) {
				return  "login";
			}
			else {
				String  username=loginBean.getUsername();
				String  password=loginBean.getPassword();
				boolean  flag=dao.verifyUserInDB(username, password);
				if(flag) {
					return  "success";
				}
				else {
					return  "failure";
				}
			}
		

	@RequestMapping(value="/getLoginPageTest3", method=RequestMethod.GET)
	public   String   getLoginPageTest3(ModelMap  modelMap) {
		LoginBean   loginBean =new LoginBean();
		modelMap.addAttribute("userLogin", loginBean);
		
		return   "login";
	}
	
	@RequestMapping(value="/getLoginPageTest2", method=RequestMethod.GET)
	public   String   getLoginPageTest2(ModelMap  modelMap) {
		LoginBean   loginBean =new LoginBean();
		modelMap.addAttribute("userLogin", loginBean);
		
		return   "login";

	}
	
	@RequestMapping(value="/getLoginPageTest4", method=RequestMethod.GET)
	public   String   getLoginPageTest54(ModelMap  modelMap) {
		LoginBean   loginBean =new LoginBean();
		modelMap.addAttribute("userLogin", loginBean);
		
		return   "login";

	}

}
