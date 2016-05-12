package edu.spring.hibernate.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.spring.hibernate.bean.Section;

@Service
@Transactional
public class SectionService extends BaseService
{
	@SuppressWarnings("unchecked")
	public List<Section> ListAllSections()
	{
		String sql1 = "MBA(36-D)%";
		String sql2 = "MBA(72-D)%";
		String sql3 = "MBA(90-D)%";
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
}
