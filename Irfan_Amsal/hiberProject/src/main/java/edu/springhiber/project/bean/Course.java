package edu.springhiber.project.bean;
// Generated May 11, 2016 9:02:45 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Course generated by hbm2java
 */
@Entity
@Table(name = "course", catalog = "sch2k16")
public class Course implements java.io.Serializable {

	private CourseId id;

	public Course() {
	}

	public Course(CourseId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "courseid", column = @Column(name = "courseid", nullable = false)),
			@AttributeOverride(name = "code", column = @Column(name = "code", length = 15)),
			@AttributeOverride(name = "title", column = @Column(name = "title", length = 100)),
			@AttributeOverride(name = "hours", column = @Column(name = "hours", length = 10)),
			@AttributeOverride(name = "abbrev", column = @Column(name = "abbrev", length = 15)) })
	public CourseId getId() {
		return this.id;
	}

	public void setId(CourseId id) {
		this.id = id;
	}

}
