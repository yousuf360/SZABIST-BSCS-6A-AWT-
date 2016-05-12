package edu.springhiber.project.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import edu.springhiber.project.bean.Days;
import edu.springhiber.project.bean.Section;
import edu.springhiber.project.bean.Slottype;
import edu.springhiber.project.bean.Vschedule;
import edu.springhiber.project.bean.Vslottype;


@Service
@Transactional
public class ScheduleService extends BaseService {

	@SuppressWarnings("unchecked")
	public List<Days> ListDays()
	{
		return getSession().createQuery("from Days").list();
	}
	
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
	
	@SuppressWarnings("unchecked")
	public List<Section> ListAllSections()
	{
		String sql1 = "MBA(36-E)%";
		String sql2 = "MBA(72-E)%";
		String sql3 = "MBA(90-E)%";
		List<Section> sec= getSession().createQuery("from Section where sectionname like '" + sql1 + "' or sectionname like '" + sql2 + "' or sectionname like '" + sql3 + "'").list();
		//List<Section> sec17 = new ArrayList<Section>();

		//for(Section secs : sec)
		//{
			//if(secs.getSectionname().contains("BS/CS")){
				//sec17.add(secs);
			//}
		//}
	return sec;
	}
	
	@SuppressWarnings("unchecked")
	public List<Slottype> ListAllSlots()
	{
		
		return getSession().createQuery("from Slottype WHERE slottypeid = 4 ").list();
	}
	
}
