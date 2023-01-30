package com.ex;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="college")

public class College {
	@Id
	@Column(name="st_id")
	private int st_id;
	@Column(name="s_name")
	private String s_name;
	@Column(name="s_marks")
	private int s_marks;
	@Column(name="section")
	private String section;
	@Column(name="branch")
	private String branch;
	public int getSt_id() {
		return st_id;
	}
	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public int getS_marks() {
		return s_marks;
	}
	public void setS_marks(int s_marks) {
		this.s_marks = s_marks;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
}
