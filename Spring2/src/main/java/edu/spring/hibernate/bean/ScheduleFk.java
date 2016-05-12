package edu.spring.hibernate.bean;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Embeddable
public class ScheduleFk implements java.io.Serializable {

	
	@ManyToOne
	@JoinColumn(name="offid")
	private Offeredcourse offeredcourse;
	@ManyToOne
	@JoinColumn(name="slotid")
	private Slots slots;
	
	public ScheduleFk(Offeredcourse offeredcourse, Slots slot) {
	
		this.offeredcourse = offeredcourse;
		this.slots = slot;
	}
	public ScheduleFk() {
	
	}
	public Offeredcourse getOfferedcourse() {
		return offeredcourse;
	}
	public void setOfferedcourse(Offeredcourse offeredcourse) {
		this.offeredcourse = offeredcourse;
	}
	public Slots getSlot() {
		return slots;
	}
	public void setSlot(Slots slot) {
		this.slots = slot;
	}
	
}
