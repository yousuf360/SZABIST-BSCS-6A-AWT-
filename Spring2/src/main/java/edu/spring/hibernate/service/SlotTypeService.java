package edu.spring.hibernate.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.spring.hibernate.bean.Slottype;
import edu.spring.hibernate.bean.Slots;
import edu.spring.hibernate.bean.Vslottype;

@Service
@Transactional
public class SlotTypeService extends BaseService
{
	@SuppressWarnings("unchecked")
	public List<Slottype> ListAllSlots()
	
	{
		return getSession().createQuery("from Slottype WHERE slottypeid <=3 ORDER by slotno").list(); 
	}
}
