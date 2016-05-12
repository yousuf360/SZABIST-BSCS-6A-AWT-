package edu.springmvc.hiber.bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Section generated by hbm2java
 */
@Entity
@Table(name = "section", catalog = "sch2k16")
public class Section implements java.io.Serializable {

	private int secid;
	private String sectionname;

	public Section() {
	}

	public Section(int secid) {
		this.secid = secid;
	}

	public Section(int secid, String sectionname) {
		this.secid = secid;
		this.sectionname = sectionname;
	}

	@Id

	@Column(name = "secid", unique = true, nullable = false)
	public int getSecid() {
		return this.secid;
	}

	public void setSecid(int secid) {
		this.secid = secid;
	}

	@Column(name = "sectionname", length = 25)
	public String getSectionname() {
		return this.sectionname;
	}

	public void setSectionname(String sectionname) {
		this.sectionname = sectionname;
	}

}
