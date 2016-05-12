package awt.project.schedule.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import awt.project.schedule.services.DayService;
import awt.project.schedule.services.SectionService;
import awt.project.schedule.services.SlotsTypeService;
import awt.project.schedule.services.ScheduleService;;

@Controller
public class IndividualScheduleController {
	@Autowired
	DayService DayService;
	@Autowired
	SectionService SectionService;
	@Autowired
	SlotsTypeService SlotTypeService;
	@Autowired
	ScheduleService ScheduleService;
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getSchedule(ModelMap model){
		model.addAttribute("Days",DayService.getDays());
		
		model.addAttribute("Sections",SectionService.getSections("MBA"));
		
		List<Integer> slottypes = new ArrayList<Integer>();
		slottypes.add(1);
		slottypes.add(2);
		slottypes.add(3);
		model.addAttribute("SlotType",SlotTypeService.getSlots(slottypes));
		model.addAttribute("hashsch",ScheduleService.fetchSchedule());
		return "MBASch";
	}
}
