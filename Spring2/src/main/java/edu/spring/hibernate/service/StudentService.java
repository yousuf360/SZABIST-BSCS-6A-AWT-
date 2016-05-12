package edu.spring.hibernate.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.spring.hibernate.bean.Student;

@Service
@Transactional
public class StudentService extends BaseService
{
	@SuppressWarnings("unchecked")
	public List<Student> ListAllStd()
	{
		return getSession().createQuery("from Student").list();
	}
	
	public void AddStudent(Student student)
	{
		getSession().persist(student);
	}
	
	public Student editStudent(int regno)
	{
		Criteria criteria = getSession().createCriteria(Student.class);
		criteria.add(Restrictions.eq("regno", regno));
		return (Student) criteria.uniqueResult();
	}
}
