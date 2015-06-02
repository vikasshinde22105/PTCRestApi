package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ClassSection generated by hbm2java
 */
@Entity
@Table(name = "class_section", catalog = "school_db")
public class ClassSection implements java.io.Serializable {

	private Integer id;
	private ClassInfo classInfo;
	private String name;
	private Integer lastUpdatedBy;
	private Date lastUpdatedOn;
	private Set timeTables = new HashSet(0);
	private Set teacherSubjects = new HashSet(0);
	private Set teacherClasses = new HashSet(0);

	public ClassSection() {
	}

	public ClassSection(ClassInfo classInfo, String name,
			Integer lastUpdatedBy, Date lastUpdatedOn, Set timeTables,
			Set teacherSubjects, Set teacherClasses) {
		this.classInfo = classInfo;
		this.name = name;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedOn = lastUpdatedOn;
		this.timeTables = timeTables;
		this.teacherSubjects = teacherSubjects;
		this.teacherClasses = teacherClasses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	public ClassInfo getClassInfo() {
		return this.classInfo;
	}

	public void setClassInfo(ClassInfo classInfo) {
		this.classInfo = classInfo;
	}

	@Column(name = "name", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "last_updated_by")
	public Integer getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(Integer lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "last_updated_on", length = 10)
	public Date getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "classSection")
	public Set getTimeTables() {
		return this.timeTables;
	}

	public void setTimeTables(Set timeTables) {
		this.timeTables = timeTables;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "classSection")
	public Set getTeacherSubjects() {
		return this.teacherSubjects;
	}

	public void setTeacherSubjects(Set teacherSubjects) {
		this.teacherSubjects = teacherSubjects;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "classSection")
	public Set getTeacherClasses() {
		return this.teacherClasses;
	}

	public void setTeacherClasses(Set teacherClasses) {
		this.teacherClasses = teacherClasses;
	}

}
