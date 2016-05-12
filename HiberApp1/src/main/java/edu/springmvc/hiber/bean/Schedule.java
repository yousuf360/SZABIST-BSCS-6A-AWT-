package edu.springmvc.hiber.bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Schedule generated by hbm2java
 */
@Entity
@Table(name = "schedule", catalog = "sch2k16", uniqueConstraints = @UniqueConstraint(columnNames = { "offid", "slotid",
		"occupied" }))
public class Schedule implements java.io.Serializable {

	private Integer schid;
	private Integer offid;
	private Integer slotid;
	private Integer occupied;

	public Schedule() {
	}

	public Schedule(Integer offid, Integer slotid, Integer occupied) {
		this.offid = offid;
		this.slotid = slotid;
		this.occupied = occupied;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "schid", unique = true, nullable = false)
	public Integer getSchid() {
		return this.schid;
	}

	public void setSchid(Integer schid) {
		this.schid = schid;
	}

	@Column(name = "offid")
	public Integer getOffid() {
		return this.offid;
	}

	public void setOffid(Integer offid) {
		this.offid = offid;
	}

	@Column(name = "slotid")
	public Integer getSlotid() {
		return this.slotid;
	}

	public void setSlotid(Integer slotid) {
		this.slotid = slotid;
	}

	@Column(name = "occupied")
	public Integer getOccupied() {
		return this.occupied;
	}

	public void setOccupied(Integer occupied) {
		this.occupied = occupied;
	}

}