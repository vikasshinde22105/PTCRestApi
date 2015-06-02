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
 * SecondaryRole generated by hbm2java
 */
@Entity
@Table(name = "secondary_role", catalog = "school_db")
public class SecondaryRole implements java.io.Serializable {

	private Short id;
	private Short primaryRoleId;
	private String description;
	private String title;
	private Byte status;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Set userRoles = new HashSet(0);

	public SecondaryRole() {
	}

	public SecondaryRole(Short primaryRoleId, String description, String title,
			Byte status, Date lastUpdatedOn, Integer lastUpdatedBy,
			Set userRoles) {
		this.primaryRoleId = primaryRoleId;
		this.description = description;
		this.title = title;
		this.status = status;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.userRoles = userRoles;
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

	@Column(name = "primary_role_id")
	public Short getPrimaryRoleId() {
		return this.primaryRoleId;
	}

	public void setPrimaryRoleId(Short primaryRoleId) {
		this.primaryRoleId = primaryRoleId;
	}

	@Column(name = "description", length = 16777215)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "title", length = 100)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "status")
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "secondaryRole")
	public Set getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(Set userRoles) {
		this.userRoles = userRoles;
	}

}
