package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SchoolCategoryType generated by hbm2java
 */
@Entity
@Table(name = "school_category_type", catalog = "school_db")
public class SchoolCategoryType implements java.io.Serializable {

	private Short id;
	private String name;
	private Byte status;
	private Double maxPoints;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Set schoolInfos = new HashSet(0);

	public SchoolCategoryType() {
	}

	public SchoolCategoryType(String name, Byte status, Double maxPoints,
			Date lastUpdatedOn, Integer lastUpdatedBy, Set schoolInfos) {
		this.name = name;
		this.status = status;
		this.maxPoints = maxPoints;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.schoolInfos = schoolInfos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	@Column(name = "name", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "status")
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	@Column(name = "max_points", precision = 15, scale = 3)
	public Double getMaxPoints() {
		return this.maxPoints;
	}

	public void setMaxPoints(Double maxPoints) {
		this.maxPoints = maxPoints;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "schoolCategoryType")
	public Set getSchoolInfos() {
		return this.schoolInfos;
	}

	public void setSchoolInfos(Set schoolInfos) {
		this.schoolInfos = schoolInfos;
	}

}