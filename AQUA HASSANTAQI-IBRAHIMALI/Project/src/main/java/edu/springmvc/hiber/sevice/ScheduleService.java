package edu.springmvc.hiber.sevice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.websocket.Session;

import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import edu.springmvc.hiber.bean.Day;
import edu.springmvc.hiber.bean.Days;
//import edu.springmvc.hiber.bean.Student;
import edu.springmvc.hiber.bean.Room;
import edu.springmvc.hiber.bean.Schedule;
import edu.springmvc.hiber.bean.Section;
import edu.springmvc.hiber.bean.Slots;
import edu.springmvc.hiber.bean.VscheduleId;
import edu.springmvc.hiber.bean.Vschedule;



@Service
@Transactional
public class ScheduleService extends BaseService {
	
	//ScheduleMapper map = new ScheduleMapper();
	
		@SuppressWarnings("unchecked")
		public List<Days> ListDays(){
			return getSession().createQuery("from Days").list();
		}
		
		@SuppressWarnings("unchecked")
		public List<Room> ListRooms(){
			return getSession().createQuery("from Room").list();
		}
		
		@SuppressWarnings("unchecked")
		public List<Slots> ListSlots(){
			return getSession().createQuery("from Vslottype").list();
		}
		
		@SuppressWarnings("unchecked")
		public List<Section> ListSections(){
			return getSession().createQuery("from Section WHERE sectionname LIKE 'BS/CS%'").list();
		}
		
		
		@SuppressWarnings("unchecked")
		public HashMap<String, List<Vschedule>> ListByCampus()
			{
				String key, pkey = null;
				HashMap<String, List<Vschedule>> hSchedule = new HashMap<String, List<Vschedule>>();
				@SuppressWarnings("unchecked")
				List<Vschedule> alSch = getSession().createQuery("from Vschedule ORDER By dayid, slotno, sectionname").list();
				List<Vschedule> alSch1 = new ArrayList<Vschedule>();
				for (Vschedule schedule : alSch)
				{
					key = schedule.getId().getDayid()+"-"+schedule.getId().getSubslotid()+"-"+schedule.getId().getSectionname();				
					if(key.equals(pkey)){
						alSch1.add(schedule);
					}else{
						alSch1 = new ArrayList<Vschedule>();
						alSch1.add(schedule);
					}
					hSchedule.put(key, alSch1);
					pkey = key;
				}
				return hSchedule;
			}


		}
