package edu.springmvc.hiber.sevice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import edu.springmvc.hiber.bean.Days;
import edu.springmvc.hiber.bean.Room;
import edu.springmvc.hiber.bean.Section;
import edu.springmvc.hiber.bean.Slots;
import edu.springmvc.hiber.bean.Vschedule;

//class ScheduleMapper implements RowMapper<HashMap<String, List<VscheduleId>>>{
//	public HashMap<String, List<VscheduleId>> mapRow(ResultSet rs, int intRow) throws SQLException {
//		// TODO Auto-generated method stub
//		
//		HashMap<String, List<VscheduleId>> hSchedule = new HashMap<String, List<VscheduleId>>();
//		List<VscheduleId> alSchedule = null;
//		String key, pkey = null;
//		VscheduleId schedule = new VscheduleId();
//		//ResultSet rs = db.query("SELECT * FROM vschedule ORDER By dayid, roomid, slotno, occupied");
//		while(rs.next()){
//		schedule.setSchid(rs.getInt("schid"));
//		schedule.setOffid(rs.getInt("offid"));
//		schedule.setSlotid(rs.getInt("slotid"));
//		schedule.setTeachername(rs.getString("teachername"));
//		schedule.setTitle(rs.getString("title"));
//		schedule.setSectionname(rs.getString("sectionname"));
//		schedule.setDayid(rs.getInt("dayid"));
//		schedule.setSlotno(rs.getInt("slotno"));
//		schedule.setRoomid(rs.getInt("roomid"));
//		schedule.setOccupied(rs.getInt("occupied"));
//		schedule.setDuration(rs.getString("duration"));
//		
//		key = schedule.getDayid()+"-"+schedule.getRoomid()+"-"+schedule.getSlotno();				
//		if(key.equals(pkey)){
//			alSchedule.add(schedule);
//		}else{
//			alSchedule = new ArrayList<VscheduleId>();
//			alSchedule.add(schedule);
//		}
//		
//		hSchedule.put(key, alSchedule);
//		pkey = key;
//		
//		}
//		
//		return hSchedule;
//	}
//}


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
			return getSession().createQuery("from Vslottype WHERE subslotid>4").list();
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


		/*public void InsertSchedule(){
			//Book book = (Book)getSession().get(Book.class, new Integer(100));
			//Member member = (Member) getSession().get(Member.class, new Integer(20));
			
			Schedule schedule = new Schedule();
			schedule
			schedule.setOffid(offid);
			issue.setBook(book);
			issue.setMember(member);
			issue.setIssuedate(new Date());
			
			getSession().save(issue);
			
		}*/
		
		/*@SuppressWarnings("unchecked")
		public List<HashMap<String, List<Schedule>>> ListByCapmus(){
			
			
			//Session session = sessionFactory.getCurrentSession();
			String query = "select new map(sch.offid, sch.teacherid , sch.teachername, sch.courseid, sch.title"
					+ ", sch.secid, sch.sectionname, sch.slotid, sch.dayid"
					+ ", sch.dayname, sch.duration, sch.slotno, sch.subslotid"
					+ ", sch.occupied, sch.roomid, sch.roomno"
					+ ", sch.campus, sch.roomtype) from VscheduleId sch";   
			//String query ="from Vschedule ORDER By dayid, roomid, slotno, occupied";
			 List<HashMap<String,List<Schedule>>> usersList = getSession().createQuery(query).list();
   //(Vschedule)getSession().createQuery(query).setResultTransformer(Transformers.aliasToBean(VscheduleId.class)).uniqueResult();

			 
			 //return usersList,map);
			 return usersList;
			
			
			
			
			String query ="from Vschedule ORDER By dayid, roomid, slotno, occupied";
			//return db.query("SELECT * FROM days", new DayMapper());
			return getSession().createQuery(query).list();
			
			//return getSession().createQuery(query).
		}
*/
}
