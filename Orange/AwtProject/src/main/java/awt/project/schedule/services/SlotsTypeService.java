package awt.project.schedule.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import awt.project.schedule.bean.Slots;
import awt.project.schedule.bean.Vschedule;

@Service
@Transactional
public class SlotsTypeService extends BaseService {
	@SuppressWarnings("unchecked")
	public List<Slots> getSlots(List<Integer> slottypes)
	{
		return getSession()
				.createQuery("from Slottype where slottypeid in (:slottype)")
				.setParameterList("slottype", slottypes)
				.list();
	}

}
