package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="statistics")
public class Statistics {

	protected Statistics() {
	
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="year")
	private Integer year;
	
	@Column(name="cse")
	private Integer cse;
	
	@Column(name="csm")
	private Integer csm;
	
	@Column(name="csd")
	private Integer csd;
	
	@Column(name="ece")
	private Integer ece;
	
	@Column(name="mech")
	private Integer mech;
	
	@Column(name="che")
	private Integer che;
	
	@Column(name="civil")
	private Integer civil;
	
	@Column(name="it")
	private Integer it;
	
	@Column(name="total")
	private Integer total;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getCse() {
		return cse;
	}

	public void setCse(Integer cse) {
		this.cse = cse;
	}

	public Integer getCsm() {
		return csm;
	}

	public void setCsm(Integer csm) {
		this.csm = csm;
	}

	public Integer getCsd() {
		return csd;
	}

	public void setCsd(Integer csd) {
		this.csd = csd;
	}

	public Integer getEce() {
		return ece;
	}

	public void setEce(Integer ece) {
		this.ece = ece;
	}

	public Integer getMech() {
		return mech;
	}

	public void setMech(Integer mech) {
		this.mech = mech;
	}

	public Integer getChe() {
		return che;
	}

	public void setChe(Integer che) {
		this.che = che;
	}

	public Integer getCivil() {
		return civil;
	}

	public void setCivil(Integer civil) {
		this.civil = civil;
	}

	public Integer getIt() {
		return it;
	}

	public void setIt(Integer it) {
		this.it = it;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Statistics(Integer id, Integer year, Integer cse, Integer csm, Integer csd, Integer ece, Integer mech,
			Integer che, Integer civil, Integer it, Integer total) {
		super();
		this.id = id;
		this.year = year;
		this.cse = cse;
		this.csm = csm;
		this.csd = csd;
		this.ece = ece;
		this.mech = mech;
		this.che = che;
		this.civil = civil;
		this.it = it;
		this.total = total;
	}
	
	
	
}
