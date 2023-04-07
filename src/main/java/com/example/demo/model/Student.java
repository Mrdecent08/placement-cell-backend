package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	
	protected Student() {
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="rollNo")
	private String rollNo;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;

	@Column(name="course")
	private String course;
	
	@Column(name="branch")
	private String branch;
	
	@Column(name="year")
	private Integer year;
	
	@Column(name="ssc")
	private String ssc;
	
	@Column(name="sscp")
	private String sscp;
	
	@Column(name="hsc")
	private String hsc;
	
	@Column(name="hscp")
	private String hscp;
	
	@Column(name="ug")
	private String ug;
	
	@Column(name="ugp")
	private String ugp;
	
	@Column(name="backlogs")
	private Integer backlogs;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="linkedIn")
	private String linkedIn;
	
	@Column(name="nationality")
	private String nationality;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="role")
	private String role;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getSsc() {
		return ssc;
	}

	public void setSsc(String ssc) {
		this.ssc = ssc;
	}

	public String getSscp() {
		return sscp;
	}

	public void setSscp(String sscp) {
		this.sscp = sscp;
	}

	public String getHsc() {
		return hsc;
	}

	public void setHsc(String hsc) {
		this.hsc = hsc;
	}

	public String getHscp() {
		return hscp;
	}

	public void setHscp(String hscp) {
		this.hscp = hscp;
	}

	public String getUg() {
		return ug;
	}

	public void setUg(String ug) {
		this.ug = ug;
	}

	public String getUgp() {
		return ugp;
	}

	public void setUgp(String ugp) {
		this.ugp = ugp;
	}

	public Integer getBacklogs() {
		return backlogs;
	}

	public void setBacklogs(Integer backlogs) {
		this.backlogs = backlogs;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getLinkedIn() {
		return linkedIn;
	}

	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Student(Integer id, String firstName, String lastName, String rollNo, String email, String password,
			String course, String branch, Integer year, String ssc, String sscp, String hsc, String hscp,
			String ug, String ugp, Integer backlogs, String dob, String linkedIn, String nationality, String phone,
			String role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
		this.email = email;
		this.password = password;
		this.course = course;
		this.branch = branch;
		this.year = year;
		this.ssc = ssc;
		this.sscp = sscp;
		this.hsc = hsc;
		this.hscp = hscp;
		this.ug = ug;
		this.ugp = ugp;
		this.backlogs = backlogs;
		this.dob = dob;
		this.linkedIn = linkedIn;
		this.nationality = nationality;
		this.phone = phone;
		this.role = role;
	}
	
	
	
}
