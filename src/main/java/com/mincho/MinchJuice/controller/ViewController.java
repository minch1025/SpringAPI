package com.mincho.MinchJuice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mincho.MinchJuice.service.ToyblogService;

@Controller
@RequestMapping("view/*")
public class ViewController {
	
	@Autowired
	ToyblogService toyblogService;
			

	@RequestMapping("view/dashboard")
	public ModelAndView dashboard() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", toyblogService.getToyblogList());
	
		
		return mav;
	}
	
}
