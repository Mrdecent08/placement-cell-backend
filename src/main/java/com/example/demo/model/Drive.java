package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="drives")
public class Drive {

	protected Drive() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="roles")
	private String roles;
	
	@Column(name="packages")
	private String packages;
	
	@Column(name="branches")
	private List<String> branches;
	
	@Column(name="status")
	private String status;
	
	@Column(name="type")
	private String type;
	
	@Column(name="referenceLinks")
	private String referenceLinks;
	
	@Column(name="backlogs")
	private Integer backlogs;
	
	@Column(name="cutoff_percent")
	private Integer cutoff_percent;

	@Column(name="date")
	private String date;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getPackages() {
		return packages;
	}

	public void setPackages(String packages) {
		this.packages = packages;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReferenceLinks() {
		return referenceLinks;
	}

	public void setReferenceLinks(String referenceLinks) {
		this.referenceLinks = referenceLinks;
	}

	public Integer getBacklogs() {
		return backlogs;
	}

	public void setBacklogs(Integer backlogs) {
		this.backlogs = backlogs;
	}

	public Integer getCutoff_percent() {
		return cutoff_percent;
	}

	public void setCutoff_percent(Integer cutoff_percent) {
		this.cutoff_percent = cutoff_percent;
	}

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public List<String> getBranches() {
		return branches;
	}

	public void setBranches(List<String> branches) {
		this.branches = branches;
	}

	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Drive(Integer id, String companyName, String roles, String packages, List<String> branches, String status,
			String type, String referenceLinks, Integer backlogs, Integer cutoff_percent, String date) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.roles = roles;
		this.packages = packages;
		this.branches = branches;
		this.status = status;
		this.type = type;
		this.referenceLinks = referenceLinks;
		this.backlogs = backlogs;
		this.cutoff_percent = cutoff_percent;
		this.date = date;
	}

	
}
