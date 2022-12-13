package com.yedam.student;

public class Student {


//	STD_ID    NOT NULL NUMBER(8)    
//	STE_NAME  NOT NULL VARCHAR2(15) 
//	STD_MAJOR          VARCHAR2(50) 
//	STD_GRADE          NUMBER(2,1) 
	private int stdId;
	private String stdName;
	private String stdMajor;
	private double stdGrade;
	
	
	
	
	
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdMajor() {
		return stdMajor;
	}
	public void setStdMajor(String stdMajor) {
		this.stdMajor = stdMajor;
	}
	public double getStdGrade() {
		return stdGrade;
	}
	public void setStdGrade(double stdPoint) {
		this.stdGrade = stdPoint;
		if(stdPoint < 0) {
			this.stdGrade = 0;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
