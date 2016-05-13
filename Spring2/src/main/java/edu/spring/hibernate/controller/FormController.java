package edu.spring.hibernate.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import edu.spring.hibernate.bean.Course;
import edu.spring.hibernate.service.CourseService;
import edu.spring.hibernate.service.RoomService;

@Controller
public class FormController {
	@Autowired
	CourseService courseService;
	@Autowired
	RoomService roomService;
	@RequestMapping(value="/getCourses", method=RequestMethod.GET)
	@ResponseBody
	public String getSchedule(@RequestParam int id,ModelMap map){
		List<Course> c = courseService.getCourses(id);
		List<String> st= new ArrayList<String>();
		for(Course course : c)
		{
			st.add(course.getCode()+"-"+course.getTitle());
		}
	
		String json=new Gson().toJson(st);
		System.out.println(json);
		return json;
	}
	@RequestMapping(value="/getRoom", method=RequestMethod.GET)
	@ResponseBody
	public String getRoom(@RequestParam int id,ModelMap map){
		
		
		String json=new Gson().toJson();
		System.out.println(json);
		return json;
	}

	
}
