package edu.springhiber.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.springhiber.project.service.ScheduleService;


@Controller
public class IndexController {

	@Autowired
	ScheduleService service;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getAllStudents(ModelMap model)
	{
		//service.AddStudent(new Student(34, "Some Guy"));
		//model.addAttribute("students", service.ListAllStd());
		model.addAttribute("slots", service.ListAllSlots());
		model.addAttribute("sections", service.ListAllSections());
		model.addAttribute("days", service.ListDays());
		model.addAttribute("hSchedule", service.ListByCampus());
		return "index";
	}

}
