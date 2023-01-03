package com.qsp.statements.statics.service;

import java.util.List;

import com.qsp.statements.statics.dao.EmployeeDao;
import com.qsp.statements.statics.dto.EmployeeDto;

public class EmployeeService {
	
	EmployeeDao dao = new EmployeeDao();
	
	// this method is for business logic
	public void insertEmployee(EmployeeDto employee) {
		
		String name = employee.getName();
		
		if(name.length()<=14) {
		dao.insertEmployee(employee);
		
	}else 
	{
		System.out.println("Idiot please the name with 14 character");
	}
		
	}
	//update method for employee table
	public void updateEmployee1(EmployeeDto employee) {
		dao.updateEmployee(employee);
	}
	public List<EmployeeDto> displayEmployee() {
		
		return dao.displayEmployee();
		
	}
	public void updateEmployee(EmployeeDto employee) {
		// TODO Auto-generated method stub
		
	}
}
	
	


