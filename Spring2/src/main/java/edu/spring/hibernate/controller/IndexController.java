package edu.spring.hibernate.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.spring.hibernate.service.DayService;
import edu.spring.hibernate.service.SectionService;
import edu.spring.hibernate.service.SlotTypeService;
import edu.spring.hibernate.service.ScheduleService;;

@Controller
public class IndexController {
	@Autowired
	DayService DayService;
	@Autowired
	SectionService SectionService;
	@Autowired
	SlotTypeService SlotTypeService;
	@Autowired
	ScheduleService ScheduleService;
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getSchedule(ModelMap model){
		model.addAttribute("Days",DayService.ListDays());
		
		model.addAttribute("Sections",SectionService.ListAllSections());
		
		List<Integer> slottypes = new ArrayList<Integer>();
		slottypes.add(1);
		slottypes.add(2);
		slottypes.add(3);
		model.addAttribute("SlotType",SlotTypeService.ListAllSlots());
		model.addAttribute("hashsch",ScheduleService.fetchSchedule());
		return "index";
	}
}
