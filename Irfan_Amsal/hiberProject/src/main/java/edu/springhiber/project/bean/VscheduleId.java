package edu.springhiber.project.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VscheduleId generated by hbm2java
 */
@Embeddable
public class VscheduleId implements java.io.Serializable {

	private int schid;
	private Integer offid;
	private Integer slotid;
	private Integer courseid;
	private Integer teacherid;
	private Integer occupied;
	private String code;
	private String title;
	private String teachername;
	private int dayid;
	private int slottypeid;
	private int roomid;
	private String duration;
	private Integer slotno;
	private int subslotid;
	private String dayname;
	private String roomno;
	private String campus;
	private String sectionname;

	public VscheduleId() {
	}

	public VscheduleId(int schid, int dayid, int slottypeid, int roomid, int subslotid) {
		this.schid = schid;
		this.dayid = dayid;
		this.slottypeid = slottypeid;
		this.roomid = roomid;
		this.subslotid = subslotid;
	}

	public VscheduleId(int schid, Integer offid, Integer slotid, Integer courseid, Integer teacherid, Integer occupied,
			String code, String title, String teachername, int dayid, int slottypeid, int roomid, String duration,
			Integer slotno, int subslotid, String dayname, String roomno, String campus, String sectionname) {
		this.schid = schid;
		this.offid = offid;
		this.slotid = slotid;
		this.courseid = courseid;
		this.teacherid = teacherid;
		this.occupied = occupied;
		this.code = code;
		this.title = title;
		this.teachername = teachername;
		this.dayid = dayid;
		this.slottypeid = slottypeid;
		this.roomid = roomid;
		this.duration = duration;
		this.slotno = slotno;
		this.subslotid = subslotid;
		this.dayname = dayname;
		this.roomno = roomno;
		this.campus = campus;
		this.sectionname = sectionname;
	}

	@Column(name = "schid", nullable = false)
	public int getSchid() {
		return this.schid;
	}

	public void setSchid(int schid) {
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

	@Column(name = "courseid")
	public Integer getCourseid() {
		return this.courseid;
	}

	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}

	@Column(name = "teacherid")
	public Integer getTeacherid() {
		return this.teacherid;
	}

	public void setTeacherid(Integer teacherid) {
		this.teacherid = teacherid;
	}

	@Column(name = "occupied")
	public Integer getOccupied() {
		return this.occupied;
	}

	public void setOccupied(Integer occupied) {
		this.occupied = occupied;
	}

	@Column(name = "code", length = 15)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "title", length = 100)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "teachername", length = 50)
	public String getTeachername() {
		return this.teachername;
	}

	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}

	@Column(name = "dayid", nullable = false)
	public int getDayid() {
		return this.dayid;
	}

	public void setDayid(int dayid) {
		this.dayid = dayid;
	}

	@Column(name = "slottypeid", nullable = false)
	public int getSlottypeid() {
		return this.slottypeid;
	}

	public void setSlottypeid(int slottypeid) {
		this.slottypeid = slottypeid;
	}

	@Column(name = "roomid", nullable = false)
	public int getRoomid() {
		return this.roomid;
	}

	public void setRoomid(int roomid) {
		this.roomid = roomid;
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

	@Column(name = "subslotid", nullable = false)
	public int getSubslotid() {
		return this.subslotid;
	}

	public void setSubslotid(int subslotid) {
		this.subslotid = subslotid;
	}

	@Column(name = "dayname", length = 20)
	public String getDayname() {
		return this.dayname;
	}

	public void setDayname(String dayname) {
		this.dayname = dayname;
	}

	@Column(name = "roomno", length = 20)
	public String getRoomno() {
		return this.roomno;
	}

	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}

	@Column(name = "campus", length = 20)
	public String getCampus() {
		return this.campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	@Column(name = "sectionname", length = 25)
	public String getSectionname() {
		return this.sectionname;
	}

	public void setSectionname(String sectionname) {
		this.sectionname = sectionname;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VscheduleId))
			return false;
		VscheduleId castOther = (VscheduleId) other;

		return (this.getSchid() == castOther.getSchid())
				&& ((this.getOffid() == castOther.getOffid()) || (this.getOffid() != null
						&& castOther.getOffid() != null && this.getOffid().equals(castOther.getOffid())))
				&& ((this.getSlotid() == castOther.getSlotid()) || (this.getSlotid() != null
						&& castOther.getSlotid() != null && this.getSlotid().equals(castOther.getSlotid())))
				&& ((this.getCourseid() == castOther.getCourseid()) || (this.getCourseid() != null
						&& castOther.getCourseid() != null && this.getCourseid().equals(castOther.getCourseid())))
				&& ((this.getTeacherid() == castOther.getTeacherid()) || (this.getTeacherid() != null
						&& castOther.getTeacherid() != null && this.getTeacherid().equals(castOther.getTeacherid())))
				&& ((this.getOccupied() == castOther.getOccupied()) || (this.getOccupied() != null
						&& castOther.getOccupied() != null && this.getOccupied().equals(castOther.getOccupied())))
				&& ((this.getCode() == castOther.getCode()) || (this.getCode() != null && castOther.getCode() != null
						&& this.getCode().equals(castOther.getCode())))
				&& ((this.getTitle() == castOther.getTitle()) || (this.getTitle() != null
						&& castOther.getTitle() != null && this.getTitle().equals(castOther.getTitle())))
				&& ((this.getTeachername() == castOther.getTeachername())
						|| (this.getTeachername() != null && castOther.getTeachername() != null
								&& this.getTeachername().equals(castOther.getTeachername())))
				&& (this.getDayid() == castOther.getDayid()) && (this.getSlottypeid() == castOther.getSlottypeid())
				&& (this.getRoomid() == castOther.getRoomid())
				&& ((this.getDuration() == castOther.getDuration()) || (this.getDuration() != null
						&& castOther.getDuration() != null && this.getDuration().equals(castOther.getDuration())))
				&& ((this.getSlotno() == castOther.getSlotno()) || (this.getSlotno() != null
						&& castOther.getSlotno() != null && this.getSlotno().equals(castOther.getSlotno())))
				&& (this.getSubslotid() == castOther.getSubslotid())
				&& ((this.getDayname() == castOther.getDayname()) || (this.getDayname() != null
						&& castOther.getDayname() != null && this.getDayname().equals(castOther.getDayname())))
				&& ((this.getRoomno() == castOther.getRoomno()) || (this.getRoomno() != null
						&& castOther.getRoomno() != null && this.getRoomno().equals(castOther.getRoomno())))
				&& ((this.getCampus() == castOther.getCampus()) || (this.getCampus() != null
						&& castOther.getCampus() != null && this.getCampus().equals(castOther.getCampus())))
				&& ((this.getSectionname() == castOther.getSectionname())
						|| (this.getSectionname() != null && castOther.getSectionname() != null
								&& this.getSectionname().equals(castOther.getSectionname())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSchid();
		result = 37 * result + (getOffid() == null ? 0 : this.getOffid().hashCode());
		result = 37 * result + (getSlotid() == null ? 0 : this.getSlotid().hashCode());
		result = 37 * result + (getCourseid() == null ? 0 : this.getCourseid().hashCode());
		result = 37 * result + (getTeacherid() == null ? 0 : this.getTeacherid().hashCode());
		result = 37 * result + (getOccupied() == null ? 0 : this.getOccupied().hashCode());
		result = 37 * result + (getCode() == null ? 0 : this.getCode().hashCode());
		result = 37 * result + (getTitle() == null ? 0 : this.getTitle().hashCode());
		result = 37 * result + (getTeachername() == null ? 0 : this.getTeachername().hashCode());
		result = 37 * result + this.getDayid();
		result = 37 * result + this.getSlottypeid();
		result = 37 * result + this.getRoomid();
		result = 37 * result + (getDuration() == null ? 0 : this.getDuration().hashCode());
		result = 37 * result + (getSlotno() == null ? 0 : this.getSlotno().hashCode());
		result = 37 * result + this.getSubslotid();
		result = 37 * result + (getDayname() == null ? 0 : this.getDayname().hashCode());
		result = 37 * result + (getRoomno() == null ? 0 : this.getRoomno().hashCode());
		result = 37 * result + (getCampus() == null ? 0 : this.getCampus().hashCode());
		result = 37 * result + (getSectionname() == null ? 0 : this.getSectionname().hashCode());
		return result;
	}

}
