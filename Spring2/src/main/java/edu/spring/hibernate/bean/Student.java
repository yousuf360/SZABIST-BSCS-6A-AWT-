package edu.spring.hibernate.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student
{
	@Id
	int regno;
	String studentname;
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public Student()
	{}
	public Student(int regno, String studentname)
	{
		this.regno = regno;
		this.studentname = studentname;
	}
	@Override
	public String toString() {
		return "Student [regno=" + regno + ", studentname=" + studentname + "]";
	}
	
}
