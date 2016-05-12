package awt.project.schedule.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import awt.project.schedule.bean.Days;

@Service
@Transactional
public class DayService extends BaseService
{
	@SuppressWarnings("unchecked")
	public List<Days> getDays()
	{
		return getSession().createQuery("from Days").list();
	}
}
