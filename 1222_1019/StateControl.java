package com.sweettracker.controller;

import java.util.ArrayList;

public class StateControl {
	ArrayList<EmployeeInfo> employeeList;
	public StateControl() {
		 init();
	}
	public void init() {
		employeeList = new ArrayList<EmployeeInfo>();
		employeeList.add(new EmployeeInfo("김인주","부장","1640, 1641","부장"));
	}
}
