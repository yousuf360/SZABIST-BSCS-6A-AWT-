package edu.spring.hibernate.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseService {
	@Autowired
	private SessionFactory sessionFactory;
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}