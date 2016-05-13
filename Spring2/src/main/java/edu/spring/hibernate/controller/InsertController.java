package edu.spring.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.spring.hibernate.bean.Schedule;
import edu.spring.hibernate.service.ScheduleService;

@Controller
public class InsertController {
	@Autowired
	ScheduleService service;	
	
	public String getSchedule(ModelMap model){
		model.addAttribute("vsch",service.fetchSchedule());
		return "index";
	}
}