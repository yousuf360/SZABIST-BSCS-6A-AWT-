package edu.springhiber.project.bean;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Vschedule generated by hbm2java
 */
@Entity
@Table(name = "vschedule", catalog = "sch2k16")
public class Vschedule implements java.io.Serializable {

	private VscheduleId id;

	public Vschedule() {
	}

	public Vschedule(VscheduleId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "schid", column = @Column(name = "schid", nullable = false)),
			@AttributeOverride(name = "offid", column = @Column(name = "offid")),
			@AttributeOverride(name = "slotid", column = @Column(name = "slotid")),
			@AttributeOverride(name = "courseid", column = @Column(name = "courseid")),
			@AttributeOverride(name = "teacherid", column = @Column(name = "teacherid")),
			@AttributeOverride(name = "occupied", column = @Column(name = "occupied")),
			@AttributeOverride(name = "code", column = @Column(name = "code", length = 15)),
			@AttributeOverride(name = "title", column = @Column(name = "title", length = 100)),
			@AttributeOverride(name = "teachername", column = @Column(name = "teachername", length = 50)),
			@AttributeOverride(name = "dayid", column = @Column(name = "dayid", nullable = false)),
			@AttributeOverride(name = "slottypeid", column = @Column(name = "slottypeid", nullable = false)),
			@AttributeOverride(name = "roomid", column = @Column(name = "roomid", nullable = false)),
			@AttributeOverride(name = "duration", column = @Column(name = "duration", length = 50)),
			@AttributeOverride(name = "slotno", column = @Column(name = "slotno")),
			@AttributeOverride(name = "subslotid", column = @Column(name = "subslotid", nullable = false)),
			@AttributeOverride(name = "dayname", column = @Column(name = "dayname", length = 20)),
			@AttributeOverride(name = "roomno", column = @Column(name = "roomno", length = 20)),
			@AttributeOverride(name = "campus", column = @Column(name = "campus", length = 20)),
			@AttributeOverride(name = "sectionname", column = @Column(name = "sectionname", length = 25)) })
	public VscheduleId getId() {
		return this.id;
	}

	public void setId(VscheduleId id) {
		this.id = id;
	}

}
