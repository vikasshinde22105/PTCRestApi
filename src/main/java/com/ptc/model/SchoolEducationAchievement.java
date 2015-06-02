package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SchoolEducationAchievement generated by hbm2java
 */
@Entity
@Table(name = "school_education_achievement", catalog = "school_db")
public class SchoolEducationAchievement implements java.io.Serializable {

	private Integer id;
	private Integer schoolId;
	private String year;
	private Float averagePercent;
	private Float passPercent;
	private Float highestPercent;
	private Float districtTopper;
	private Float stateTopper;
	private Byte sortOrder;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;

	public SchoolEducationAchievement() {
	}

	public SchoolEducationAchievement(Integer schoolId, String year,
			Float averagePercent, Float passPercent, Float highestPercent,
			Float districtTopper, Float stateTopper, Byte sortOrder,
			Date lastUpdatedOn, Integer lastUpdatedBy) {
		this.schoolId = schoolId;
		this.year = year;
		this.averagePercent = averagePercent;
		this.passPercent = passPercent;
		this.highestPercent = highestPercent;
		this.districtTopper = districtTopper;
		this.stateTopper = stateTopper;
		this.sortOrder = sortOrder;
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

	@Column(name = "school_id")
	public Integer getSchoolId() {
		return this.schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	@Column(name = "year", length = 4)
	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Column(name = "average_percent", precision = 9, scale = 3)
	public Float getAveragePercent() {
		return this.averagePercent;
	}

	public void setAveragePercent(Float averagePercent) {
		this.averagePercent = averagePercent;
	}

	@Column(name = "pass_percent", precision = 9, scale = 3)
	public Float getPassPercent() {
		return this.passPercent;
	}

	public void setPassPercent(Float passPercent) {
		this.passPercent = passPercent;
	}

	@Column(name = "highest_percent", precision = 9, scale = 3)
	public Float getHighestPercent() {
		return this.highestPercent;
	}

	public void setHighestPercent(Float highestPercent) {
		this.highestPercent = highestPercent;
	}

	@Column(name = "district_topper", precision = 9, scale = 3)
	public Float getDistrictTopper() {
		return this.districtTopper;
	}

	public void setDistrictTopper(Float districtTopper) {
		this.districtTopper = districtTopper;
	}

	@Column(name = "state_topper", precision = 9, scale = 3)
	public Float getStateTopper() {
		return this.stateTopper;
	}

	public void setStateTopper(Float stateTopper) {
		this.stateTopper = stateTopper;
	}

	@Column(name = "sort_order")
	public Byte getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Byte sortOrder) {
		this.sortOrder = sortOrder;
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