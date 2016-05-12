package awt.project.schedule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import awt.project.schedule.bean.Schedule;
import awt.project.schedule.services.ScheduleService;

@Controller
public class InsertController {
	@Autowired
	ScheduleService service;	
	
	public String getSchedule(ModelMap model){
		model.addAttribute("vsch",service.fetchSchedule());
		return "MBASch";
	}
}
