package com.qsp.statements.statics.controller;

import java.util.List;

import com.qsp.statements.statics.dao.EmployeeDao;
import com.qsp.statements.statics.dto.EmployeeDto;
import com.qsp.statements.statics.service.EmployeeService;

public class EmployeeController {
	public static void main(String[] args) {
		
		EmployeeDto employee = new EmployeeDto();
		
		EmployeeService employeeService= new EmployeeService();  
		
		boolean b = true;
		
		while(b) {
			switch(4) {
			case 1: { 
				employee.setId(111);
				employee.setName("tejinderpalsin");
				employee.setEmail("tejinder@gmail.com");
				employeeService.insertEmployee(employee);
			}break;
			
			case 2: {
				employee.setId(101);
				employee.setName("abc"); 
				employeeService.updateEmployee(employee);
				
			}
			break;
         case 3:{
        	 employee.setId(111);
        	 System.out.println("controller-class");
        	 employeeService.updateEmployee(employee);
        	 

         }
         break;
			case 4:{
				List<EmployeeDto> emp = employeeService.displayEmployee();
				
				for(EmployeeDto emp1 : emp) {
					System.out.println(emp1.getId());
					System.out.println(emp1.getName());
					System.out.println(emp1.getEmail());
				}break;
				
			}
				
			
			
			
			default:
			break;
			}
			
			b=false;
		}
	}

}
