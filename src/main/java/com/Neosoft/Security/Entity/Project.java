package com.Neosoft.Security.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Project {
	
@Id
@GeneratedValue
private Integer projid;
private String projname;
private String duration;

public Integer getProjid() {
	return projid;
}
public void setProjid(Integer projid) {
	this.projid = projid;
}
public String getProjname() {
	return projname;
}
public void setProjname(String projname) {
	this.projname = projname;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}

}
