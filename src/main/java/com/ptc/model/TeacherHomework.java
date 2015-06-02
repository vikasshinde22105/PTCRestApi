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
 * TeacherHomework generated by hbm2java
 */
@Entity
@Table(name = "teacher_homework", catalog = "school_db")
public class TeacherHomework implements java.io.Serializable {

	private Integer id;
	private TimeTable timeTable;
	private Integer homeworkDesc;
	private Boolean isDeleted;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Set teacherHomeworkRemarkses = new HashSet(0);

	public TeacherHomework() {
	}

	public TeacherHomework(TimeTable timeTable, Integer homeworkDesc,
			Boolean isDeleted, Date lastUpdatedOn, Integer lastUpdatedBy,
			Set teacherHomeworkRemarkses) {
		this.timeTable = timeTable;
		this.homeworkDesc = homeworkDesc;
		this.isDeleted = isDeleted;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.teacherHomeworkRemarkses = teacherHomeworkRemarkses;
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
	@JoinColumn(name = "time_table_id")
	public TimeTable getTimeTable() {
		return this.timeTable;
	}

	public void setTimeTable(TimeTable timeTable) {
		this.timeTable = timeTable;
	}

	@Column(name = "homework_desc")
	public Integer getHomeworkDesc() {
		return this.homeworkDesc;
	}

	public void setHomeworkDesc(Integer homeworkDesc) {
		this.homeworkDesc = homeworkDesc;
	}

	@Column(name = "is_deleted")
	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "last_updated_on", length = 10)
	public Date getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	@Column(name = "last_updated_by")
	public Integer getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(Integer lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "teacherHomework")
	public Set getTeacherHomeworkRemarkses() {
		return this.teacherHomeworkRemarkses;
	}

	public void setTeacherHomeworkRemarkses(Set teacherHomeworkRemarkses) {
		this.teacherHomeworkRemarkses = teacherHomeworkRemarkses;
	}

}
