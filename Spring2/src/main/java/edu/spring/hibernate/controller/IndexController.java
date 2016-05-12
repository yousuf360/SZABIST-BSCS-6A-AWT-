package edu.spring.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.spring.hibernate.service.DayService;
import edu.spring.hibernate.service.RoomService;
import edu.spring.hibernate.service.ScheduleService;
import edu.spring.hibernate.service.SectionService;
import edu.spring.hibernate.service.SlotTypeService;
import edu.spring.hibernate.service.StudentService;

@Controller
public class IndexController
{
	@Autowired
	StudentService service;
	@Autowired
	SlotTypeService slotservice;
	@Autowired
	SectionService sectionservice;
	@Autowired
	DayService dayservice;
	@Autowired
	ScheduleService schservice;
	@Autowired
	RoomService roomservice;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getAllStudents(ModelMap model)
	{
		//service.AddStudent(new Student(34, "Some Guy"));
		//model.addAttribute("students", service.ListAllStd());
		model.addAttribute("slots", slotservice.ListAllSlots());
		model.addAttribute("sections", sectionservice.ListAllSections());
		model.addAttribute("days", dayservice.ListDays());
		model.addAttribute("hSchedule", schservice.ListByCampus());
		model.addAttribute("rooms", roomservice.ListAllRoom());
		return "index";
	}
	
	//@RequestMapping(value="/edit", method=RequestMethod.GET)
	//public String editStudent(int regno, ModelMap model)
	//{
		//model.addAttribute("student", service.editStudent(regno));
		//return "edit";
	//}
}
