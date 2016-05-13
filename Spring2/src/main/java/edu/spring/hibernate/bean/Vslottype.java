package edu.spring.hibernate.bean;

// default package
// Generated May 11, 2016 7:42:13 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Vslottype generated by hbm2java
 */
@Entity
@Table(name = "vslottype", catalog = "sch2k16")
public class Vslottype implements java.io.Serializable {

	private VslottypeId id;

	public Vslottype() {
	}

	public Vslottype(VslottypeId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "slottypeid", column = @Column(name = "slottypeid", nullable = false)),
			@AttributeOverride(name = "duration", column = @Column(name = "duration", length = 50)),
			@AttributeOverride(name = "slotno", column = @Column(name = "slotno")),
			@AttributeOverride(name = "sort", column = @Column(name = "sort", nullable = false, precision = 12, scale = 1)),
			@AttributeOverride(name = "subslotid", column = @Column(name = "subslotid", nullable = false)),
			@AttributeOverride(name = "occupied", column = @Column(name = "occupied")) })
	public VslottypeId getId() {
		return this.id;
	}

	public void setId(VslottypeId id) {
		this.id = id;
	}

}
