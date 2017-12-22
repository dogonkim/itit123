package com.sweettracker.controller;

public class EmployeeInfo {
	private String name;
	private String position;
	private String number;
	private String work;
	
	public EmployeeInfo(String name, String position, String number, String work) {
		super();
		this.name = name;
		this.position = position;
		this.number = number;
		this.work = work;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	
}
