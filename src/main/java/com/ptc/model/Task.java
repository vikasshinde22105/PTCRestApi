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
 * Task generated by hbm2java
 */
@Entity
@Table(name = "task", catalog = "school_db")
public class Task implements java.io.Serializable {

	private Integer id;
	private UserRegistrationInfo userRegistrationInfoByAssignedBy;
	private UserRegistrationInfo userRegistrationInfoByToUserId;
	private String brief;
	private String description;
	private Date assignedOn;
	private Date taskStartDate;
	private Date taskEndDate;
	private Byte isAccepted;
	private Byte isComplete;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private String notAcceptedReason;

	public Task() {
	}

	public Task(UserRegistrationInfo userRegistrationInfoByAssignedBy,
			UserRegistrationInfo userRegistrationInfoByToUserId, String brief,
			String description, Date assignedOn, Date taskStartDate,
			Date taskEndDate, Byte isAccepted, Byte isComplete,
			Date lastUpdatedOn, Integer lastUpdatedBy, String notAcceptedReason) {
		this.userRegistrationInfoByAssignedBy = userRegistrationInfoByAssignedBy;
		this.userRegistrationInfoByToUserId = userRegistrationInfoByToUserId;
		this.brief = brief;
		this.description = description;
		this.assignedOn = assignedOn;
		this.taskStartDate = taskStartDate;
		this.taskEndDate = taskEndDate;
		this.isAccepted = isAccepted;
		this.isComplete = isComplete;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.notAcceptedReason = notAcceptedReason;
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
	@JoinColumn(name = "assigned_by")
	public UserRegistrationInfo getUserRegistrationInfoByAssignedBy() {
		return this.userRegistrationInfoByAssignedBy;
	}

	public void setUserRegistrationInfoByAssignedBy(
			UserRegistrationInfo userRegistrationInfoByAssignedBy) {
		this.userRegistrationInfoByAssignedBy = userRegistrationInfoByAssignedBy;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "to_user_id")
	public UserRegistrationInfo getUserRegistrationInfoByToUserId() {
		return this.userRegistrationInfoByToUserId;
	}

	public void setUserRegistrationInfoByToUserId(
			UserRegistrationInfo userRegistrationInfoByToUserId) {
		this.userRegistrationInfoByToUserId = userRegistrationInfoByToUserId;
	}

	@Column(name = "brief", length = 20)
	public String getBrief() {
		return this.brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "assigned_on", length = 10)
	public Date getAssignedOn() {
		return this.assignedOn;
	}

	public void setAssignedOn(Date assignedOn) {
		this.assignedOn = assignedOn;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "task_start_date", length = 10)
	public Date getTaskStartDate() {
		return this.taskStartDate;
	}

	public void setTaskStartDate(Date taskStartDate) {
		this.taskStartDate = taskStartDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "task_end_date", length = 10)
	public Date getTaskEndDate() {
		return this.taskEndDate;
	}

	public void setTaskEndDate(Date taskEndDate) {
		this.taskEndDate = taskEndDate;
	}

	@Column(name = "is_accepted")
	public Byte getIsAccepted() {
		return this.isAccepted;
	}

	public void setIsAccepted(Byte isAccepted) {
		this.isAccepted = isAccepted;
	}

	@Column(name = "is_complete")
	public Byte getIsComplete() {
		return this.isComplete;
	}

	public void setIsComplete(Byte isComplete) {
		this.isComplete = isComplete;
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

	@Column(name = "not_accepted_reason")
	public String getNotAcceptedReason() {
		return this.notAcceptedReason;
	}

	public void setNotAcceptedReason(String notAcceptedReason) {
		this.notAcceptedReason = notAcceptedReason;
	}

}
