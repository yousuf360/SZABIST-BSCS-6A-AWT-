package edu.springhiber.project.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Days generated by hbm2java
 */
@Entity
@Table(name = "days", catalog = "sch2k16")
public class Days implements java.io.Serializable {

	private int dayid;
	private String dayname;

	public Days() {
	}

	public Days(int dayid) {
		this.dayid = dayid;
	}

	public Days(int dayid, String dayname) {
		this.dayid = dayid;
		this.dayname = dayname;
	}

	@Id

	@Column(name = "dayid", unique = true, nullable = false)
	public int getDayid() {
		return this.dayid;
	}

	public void setDayid(int dayid) {
		this.dayid = dayid;
	}

	@Column(name = "dayname", length = 20)
	public String getDayname() {
		return this.dayname;
	}

	public void setDayname(String dayname) {
		this.dayname = dayname;
	}

}
