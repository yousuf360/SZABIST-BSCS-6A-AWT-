package awt.project.schedule.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import awt.project.schedule.bean.Section;

@Service
@Transactional
public class SectionService extends BaseService
{
	@SuppressWarnings("unchecked")
	public List<Section> getSections(String program)
	{
		return getSession()
				.createQuery("from Section where sectionname like :program order by sectionname")
				.setString("program", program+"%"+"D"+")"+"%")
				.list();
	}
}
