package edu.spring.hibernate.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.spring.hibernate.bean.Room;
@Service
@Transactional
public class RoomService extends BaseService
{
	@SuppressWarnings("unchecked")
	public List<Room> getRooms(int dayid,int slottype){
		return getSession().createQuery("from Room where roomid IN ").list();
		
	}
	
}
