package edu.spring.hibernate.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.spring.hibernate.bean.Days;

@Service
@Transactional
public class DayService extends BaseService
{
	@SuppressWarnings("unchecked")
	public List<Days> ListDays()
	{
		return getSession().createQuery("from Days").list();
	}
}
