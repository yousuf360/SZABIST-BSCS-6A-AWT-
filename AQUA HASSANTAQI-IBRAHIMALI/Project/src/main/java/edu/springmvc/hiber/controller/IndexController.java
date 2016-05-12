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
		model.addAttribute("hSchedule", service.ListByCampus());
		
		
		return "index";
	}
	
	

		
	
	
	
}
