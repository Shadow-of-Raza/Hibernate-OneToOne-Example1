package com.mavan.HiberbateApplication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student1 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentid;
	
	@Column(length = 40, nullable = false)
	private String studentname;
	
	@OneToOne
	@JoinColumn(name = "courseid")
	Courses course;
	public Student1() {
		super();
	}
	public Student1(String studentname) {
		super();
		this.studentname = studentname;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	
	public Courses getCourse() {
		return course;
	}
	public void setCourse(Courses course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student1 [studentid=" + studentid + ", studentname=" + studentname + "]";
	}
	
	
}
