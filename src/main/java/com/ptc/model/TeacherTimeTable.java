package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TeacherTimeTable generated by hbm2java
 */
@Entity
@Table(name = "teacher_time_table", catalog = "school_db")
public class TeacherTimeTable implements java.io.Serializable {

	private Integer id;
	private TimeTable timeTable;
	private TeacherStaffInfo teacherStaffInfo;
	private Byte isDeleted;
	private Integer lastUpdatedBy;
	private Date lastUpdatedOn;

	public TeacherTimeTable() {
	}

	public TeacherTimeTable(TimeTable timeTable,
			TeacherStaffInfo teacherStaffInfo, Byte isDeleted,
			Integer lastUpdatedBy, Date lastUpdatedOn) {
		this.timeTable = timeTable;
		this.teacherStaffInfo = teacherStaffInfo;
		this.isDeleted = isDeleted;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedOn = lastUpdatedOn;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "teacher_id")
	public TeacherStaffInfo getTeacherStaffInfo() {
		return this.teacherStaffInfo;
	}

	public void setTeacherStaffInfo(TeacherStaffInfo teacherStaffInfo) {
		this.teacherStaffInfo = teacherStaffInfo;
	}

	@Column(name = "is_deleted")
	public Byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
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

}
