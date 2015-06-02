package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

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
 * SchoolEmergencyContact generated by hbm2java
 */
@Entity
@Table(name = "school_emergency_contact", catalog = "school_db")
public class SchoolEmergencyContact implements java.io.Serializable {

	private Integer id;
	private School school;
	private String priContactPhone;
	private String priContactEmail;
	private String priContactMobile;
	private String secContactPhone;
	private String secContactEmail;
	private String secContactMobile;
	private Date lastUpdatedOn;
	private Byte status;
	private Integer lastUpdatedBy;

	public SchoolEmergencyContact() {
	}

	public SchoolEmergencyContact(School school, String priContactPhone,
			String priContactEmail, String priContactMobile,
			String secContactPhone, String secContactEmail,
			String secContactMobile, Date lastUpdatedOn, Byte status,
			Integer lastUpdatedBy) {
		this.school = school;
		this.priContactPhone = priContactPhone;
		this.priContactEmail = priContactEmail;
		this.priContactMobile = priContactMobile;
		this.secContactPhone = secContactPhone;
		this.secContactEmail = secContactEmail;
		this.secContactMobile = secContactMobile;
		this.lastUpdatedOn = lastUpdatedOn;
		this.status = status;
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
	@JoinColumn(name = "school_id")
	public School getSchool() {
		return this.school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Column(name = "pri_contact_phone", length = 20)
	public String getPriContactPhone() {
		return this.priContactPhone;
	}

	public void setPriContactPhone(String priContactPhone) {
		this.priContactPhone = priContactPhone;
	}

	@Column(name = "pri_contact_email", length = 20)
	public String getPriContactEmail() {
		return this.priContactEmail;
	}

	public void setPriContactEmail(String priContactEmail) {
		this.priContactEmail = priContactEmail;
	}

	@Column(name = "pri_contact_mobile", length = 20)
	public String getPriContactMobile() {
		return this.priContactMobile;
	}

	public void setPriContactMobile(String priContactMobile) {
		this.priContactMobile = priContactMobile;
	}

	@Column(name = "sec_contact_phone", length = 20)
	public String getSecContactPhone() {
		return this.secContactPhone;
	}

	public void setSecContactPhone(String secContactPhone) {
		this.secContactPhone = secContactPhone;
	}

	@Column(name = "sec_contact_email", length = 20)
	public String getSecContactEmail() {
		return this.secContactEmail;
	}

	public void setSecContactEmail(String secContactEmail) {
		this.secContactEmail = secContactEmail;
	}

	@Column(name = "sec_contact_mobile", length = 20)
	public String getSecContactMobile() {
		return this.secContactMobile;
	}

	public void setSecContactMobile(String secContactMobile) {
		this.secContactMobile = secContactMobile;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "last_updated_on", length = 10)
	public Date getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	@Column(name = "status")
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	@Column(name = "last_updated_by")
	public Integer getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(Integer lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

}
