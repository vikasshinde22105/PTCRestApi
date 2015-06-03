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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * SchoolTeacher generated by hbm2java
 */
@Entity
@Table(name = "school_teacher", catalog = "school_db")
public class SchoolTeacher implements java.io.Serializable {

	private Integer id;
	private School school;
	private TeacherStaffInfo teacherStaffInfo;
	private Short facultyTypeId;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;

	public SchoolTeacher() {
	}

	public SchoolTeacher(School school, TeacherStaffInfo teacherStaffInfo,
			Short facultyTypeId, Date lastUpdatedOn, Integer lastUpdatedBy) {
		this.school = school;
		this.teacherStaffInfo = teacherStaffInfo;
		this.facultyTypeId = facultyTypeId;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "school_id")
	@JsonBackReference
	public School getSchool() {
		return this.school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "teacher_id")
    @JsonBackReference
	public TeacherStaffInfo getTeacherStaffInfo() {
		return this.teacherStaffInfo;
	}

	public void setTeacherStaffInfo(TeacherStaffInfo teacherStaffInfo) {
		this.teacherStaffInfo = teacherStaffInfo;
	}

	@Column(name = "faculty_type_id")
	public Short getFacultyTypeId() {
		return this.facultyTypeId;
	}

	public void setFacultyTypeId(Short facultyTypeId) {
		this.facultyTypeId = facultyTypeId;
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

}
