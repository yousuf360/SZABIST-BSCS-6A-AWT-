package edu.spring.hibernate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.spring.hibernate.bean.Course;
import edu.spring.hibernate.bean.Offeredcourse;
import edu.spring.hibernate.bean.Section;
import edu.spring.hibernate.bean.Sectiondetails;

@Service
@Transactional
public class CourseService extends BaseService {
public List<Course> getCourses(int secid){
	@SuppressWarnings("unchecked")
	List<Sectiondetails> secdetail = getSession()
			.createQuery("from Sectiondetails where secid=:secid")
			.setInteger("secid", secid)
			.list(); 
	List<Course> courses = new ArrayList<Course>();
	for (Sectiondetails sectiondetails : secdetail) {
		courses.add(((Offeredcourse) getSession()
				.createQuery("from Offeredcourse where offid=:offid")
				.setInteger("offid", sectiondetails
				.getOffid())
				.list()
				.get(0))
				.getCourse());
		
	}
	return courses;
}
}
