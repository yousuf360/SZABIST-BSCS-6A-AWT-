package edu.spring.hibernate.bean;// default package
// Generated May 11, 2016 11:55:44 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Slottype generated by hbm2java
 */
@Entity
@Table(name = "slottype", catalog = "sch2k16")
public class SlotType implements java.io.Serializable {

	private int slottypeid;
	private String duration;
	private Integer slotno;
	private Integer slottype;
	private Integer subslot;

	public SlotType() {
	}

	public SlotType(int slottypeid) {
		this.slottypeid = slottypeid;
	}

	public SlotType(int slottypeid, String duration, Integer slotno, Integer slottype, Integer subslot) {
		this.slottypeid = slottypeid;
		this.duration = duration;
		this.slotno = slotno;
		this.slottype = slottype;
		this.subslot = subslot;
	}

	@Id

	@Column(name = "slottypeid", unique = true, nullable = false)
	public int getSlottypeid() {
		return this.slottypeid;
	}

	public void setSlottypeid(int slottypeid) {
		this.slottypeid = slottypeid;
	}

	@Column(name = "duration", length = 50)
	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Column(name = "slotno")
	public Integer getSlotno() {
		return this.slotno;
	}

	public void setSlotno(Integer slotno) {
		this.slotno = slotno;
	}

	@Column(name = "slottype")
	public Integer getSlottype() {
		return this.slottype;
	}

	public void setSlottype(Integer slottype) {
		this.slottype = slottype;
	}

	@Column(name = "subslot")
	public Integer getSubslot() {
		return this.subslot;
	}

	public void setSubslot(Integer subslot) {
		this.subslot = subslot;
	}

}
