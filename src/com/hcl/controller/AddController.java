package com.hcl.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public ModelAndView addNumbers(HttpServletRequest request) {
		int no1=Integer.parseInt(request.getParameter("no1"));
		int no2=Integer.parseInt(request.getParameter("no2"));
		int result=no1+no2;
		ModelAndView mav=new ModelAndView();
		mav.addObject("rs", result);
		mav.addObject("message", "This is result: ");
		mav.setViewName("add-result");
		return mav;
	}
	
	@RequestMapping(path = "/form", method = RequestMethod.GET)
	public String getForm() {
		return "addform";
	}
}
