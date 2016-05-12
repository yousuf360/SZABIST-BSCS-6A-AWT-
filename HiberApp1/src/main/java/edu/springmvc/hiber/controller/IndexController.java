package edu.springmvc.hiber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.springmvc.hiber.sevice.ScheduleService;


@Controller
public class IndexController {
	
	@Autowired
	ScheduleService service;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getAllDays(ModelMap model){
		model.addAttribute("Days", service.ListDays());
		model.addAttribute("Rooms", service.ListRooms());
		model.addAttribute("Slots", service.ListSlots());
		model.addAttribute("Sections", service.ListSections());
		model.addAttribute("hSchdule", service.ListByCampus());
		//int[] slotcount = {1,2,3,4,5,6};
		//model.addAttribute(slotcount);
		//model.addAttribute("hSchdule", service.ListByCapmus());
		//service.AddStudent(new Student("Peter"));
		//service.AddPostandAuthor();
		
		//service.doIssue();
		
		
		return "index";
	}
	
	
	/*@RequestMapping(value="/", method=RequestMethod.GET)
	public String getAllStudents(ModelMap model){
		model.addAttribute("students", service.ListStudents());
		//service.AddStudent(new Student("Peter"));
		//service.AddPostandAuthor();
		
		//service.doIssue();
		
		
		return "index";
	}*/
	
	
}
