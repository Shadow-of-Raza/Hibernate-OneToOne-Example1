package com.mavan.HiberbateApplication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Courses 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseid;
	@Column(length = 40, nullable = false, unique = true)
	private String coursename;
	@Column(nullable = false)
	private float coursefee;
	public Courses() {
		super();
	}
	public Courses(String coursename, float coursefee) {
		super();
		this.coursename = coursename;
		this.coursefee = coursefee;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public float getCoursefee() {
		return coursefee;
	}
	public void setCoursefee(float coursefee) {
		this.coursefee = coursefee;
	}
	@Override
	public String toString() {
		return "Courses [courseid=" + courseid + ", coursename=" + coursename + ", coursefee=" + coursefee + "]";
	}
	
}
