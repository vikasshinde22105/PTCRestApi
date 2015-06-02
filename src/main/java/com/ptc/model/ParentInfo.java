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
 * ParentInfo generated by hbm2java
 */
@Entity
@Table(name = "parent_info", catalog = "school_db")
public class ParentInfo implements java.io.Serializable {

	private Integer id;
	private UserRegistrationInfo userRegistrationInfo;
	private Boolean userType;
	private String emergencyMobileNo;
	private Short occupationTypeId;
	private String organizationName;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;

	public ParentInfo() {
	}

	public ParentInfo(UserRegistrationInfo userRegistrationInfo,
			Boolean userType, String emergencyMobileNo, Short occupationTypeId,
			String organizationName, Date lastUpdatedOn, Integer lastUpdatedBy) {
		this.userRegistrationInfo = userRegistrationInfo;
		this.userType = userType;
		this.emergencyMobileNo = emergencyMobileNo;
		this.occupationTypeId = occupationTypeId;
		this.organizationName = organizationName;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public UserRegistrationInfo getUserRegistrationInfo() {
		return this.userRegistrationInfo;
	}

	public void setUserRegistrationInfo(
			UserRegistrationInfo userRegistrationInfo) {
		this.userRegistrationInfo = userRegistrationInfo;
	}

	@Column(name = "user_type")
	public Boolean getUserType() {
		return this.userType;
	}

	public void setUserType(Boolean userType) {
		this.userType = userType;
	}

	@Column(name = "emergency_mobile_no", length = 15)
	public String getEmergencyMobileNo() {
		return this.emergencyMobileNo;
	}

	public void setEmergencyMobileNo(String emergencyMobileNo) {
		this.emergencyMobileNo = emergencyMobileNo;
	}

	@Column(name = "occupation_type_id")
	public Short getOccupationTypeId() {
		return this.occupationTypeId;
	}

	public void setOccupationTypeId(Short occupationTypeId) {
		this.occupationTypeId = occupationTypeId;
	}

	@Column(name = "organization_name", length = 200)
	public String getOrganizationName() {
		return this.organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
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
