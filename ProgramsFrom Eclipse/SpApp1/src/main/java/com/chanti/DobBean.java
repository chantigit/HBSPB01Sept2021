package com.chanti;

public class DobBean {
	private int day;
	private String month;
	private int year;
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}
	

}
