package awt.project.schedule.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import awt.project.schedule.bean.Offeredcourse;
import awt.project.schedule.bean.Schedule;
import awt.project.schedule.bean.Section;
import awt.project.schedule.bean.Sectiondetails;
import awt.project.schedule.bean.Slots;
import awt.project.schedule.bean.Vschedule;

@Service
@Transactional
public class ScheduleService extends BaseService{
	public void insert(){
		Offeredcourse offeredcourse= 
				(Offeredcourse)getSession().get(
						Offeredcourse.class, new Integer(260));
		
		Slots slot = 
				(Slots)getSession().get(
						Slots.class, new Integer(208));
		Schedule schedule = new Schedule();
		schedule.setOfferedcourse(offeredcourse);
		schedule.setSlot(slot);
		schedule.setSchid(1000);
		schedule.setOccupied(4);
		getSession().save(schedule);
		
	}
	@SuppressWarnings("unchecked")
	public HashMap<String, Schedule> fetchSchedule(){
		
		
		List<Offeredcourse> offlist  =  getSession().createQuery("from Offeredcourse where offid IN (select offid from Sectiondetails  WHERE secid IN (select secid from Section where sectionname LIKE  'MBA%D)%' ORDER BY sectionname))").list();
		List<Schedule> schList = new ArrayList<Schedule>();
		for (Offeredcourse offeredcourse : offlist) {
		 	schList.addAll(offeredcourse.getSchedule());
		}
		HashMap<String,Schedule> hsch = new HashMap<String, Schedule>();
		for (Schedule schedule : schList) {
			int secid = ((Sectiondetails) getSession()
					.createQuery(" from Sectiondetails where offid="+schedule
					.getOfferdcourse()
					.getOffid())
					.list()
					.get(0)).getSecid();
			
			String key=schedule.getSlot().getDayid()
					+"-"+schedule.getSlot().getSlottypeid()
					+"-"+secid;
		hsch.put(key, schedule);
		
		}
		
		return hsch;
	
	}
}
