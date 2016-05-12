package edu.spring.hibernate.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.spring.hibernate.bean.Vschedule;

@Service
@Transactional
public class ScheduleService extends BaseService
{
	public HashMap<String, List<Vschedule>> ListByCampus()
	{
		String key, pkey = null;
		HashMap<String, List<Vschedule>> hSchedule = new HashMap<String, List<Vschedule>>();
		@SuppressWarnings("unchecked")
		List<Vschedule> alSch = getSession().createQuery("from Vschedule ORDER By dayid, slotno, sectionname").list();
		List<Vschedule> alSch1 = new ArrayList<Vschedule>();
		for (Vschedule vschedule : alSch)
		{
			key = vschedule.getId().getDayid()+"-"+vschedule.getId().getSubslotid()+"-"+vschedule.getId().getSectionname();				
			if(key.equals(pkey)){
				alSch1.add(vschedule);
			}else{
				alSch1 = new ArrayList<Vschedule>();
				alSch1.add(vschedule);
			}
			hSchedule.put(key, alSch1);
			pkey = key;
		}
		return hSchedule;
	}
	
	
}
