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
 * UserRole generated by hbm2java
 */
@Entity
@Table(name = "user_role", catalog = "school_db")
public class UserRole implements java.io.Serializable {

	private Integer id;
	private UserRegistrationInfo userRegistrationInfo;
	private Short secRoleId;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;

	public UserRole() {
	}

	public UserRole(UserRegistrationInfo userRegistrationInfo, Short secRoleId,
			Date lastUpdatedOn, Integer lastUpdatedBy) {
		this.userRegistrationInfo = userRegistrationInfo;
		this.secRoleId = secRoleId;
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

	@Column(name = "sec_role_id")
	public Short getSecRoleId() {
		return this.secRoleId;
	}

	public void setSecRoleId(Short secRoleId) {
		this.secRoleId = secRoleId;
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
