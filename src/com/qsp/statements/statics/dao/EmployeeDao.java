package com.qsp.statements.statics.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.qsp.statements.statics.connection.EmployeeConnection;
import com.qsp.statements.statics.dto.EmployeeDto;

public class EmployeeDao {
	
	// this method will insert the emloyee data inside the database
	Connection connection=null;
	 public void insertEmployee(EmployeeDto employee) {
		
		try {
			//step-1 create the connection
		  //Class.forName("com.mysql.cj.jdbc.Driver");
		 //	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc--statements-statics","root","sonu1118");
		    connection=EmployeeConnection.getConnection();
		   			Statement statement=connection.createStatement();
         // step-3 Create the statement
			
			String insert = "insert into Employee values("+employee.getId()+",'"+employee.getName()+"','"+employee.getEmail()+"') ";
			// step-4 Execute the query
			statement.execute(insert);
			
			System.out.println("Data stored............");
			
			
		} catch ( SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	 }
	 // update method for employee table
	 public void updateEmployee(EmployeeDto employee)  {
		 
		 
//		 System.out.println(employee.getName());
		 Statement statement;
		try {
			connection= EmployeeConnection.getConnection();
			statement = connection.createStatement();
			 String update="update employee set name ='"+employee.getName()+"' where id ="+employee.getId()+"";
			  statement.execute(update);
			  
			  System.out.println("Data Updated");
			  
			
			
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				 
		
			 
	 }
	 private String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	// delete method for employee table
	 public void deleteEmployee(EmployeeDto employee) {
		 
		 
		 Statement statement;
		try {
			connection=EmployeeConnection.getConnection();
			statement = connection.createStatement();
			
			 String delete="delete from employee where id="+employee.getId()+"";
			 statement.execute(delete);
			 System.out.println("Data Deleted......");
			
			
			
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		 
		 
		 
	 }
	 
	 // display method
	 
	 public List<EmployeeDto> displayEmployee(){
		 
	 Statement statement;
		 
		 
		try {
			connection=EmployeeConnection.getConnection();
			   statement = connection.createStatement();
			  
			  String display="select * from employee";
			  
			  ResultSet resultSet;
			resultSet = statement.executeQuery(display);
			
			 List<EmployeeDto> employees =new ArrayList<EmployeeDto>();  
			  while(resultSet.next()) {
			  
			  EmployeeDto employee =new EmployeeDto();
			  employees.add(employee);
			  employee.setId(resultSet.getInt("id"));
			  employee.setName(resultSet.getString("name"));
			  employee.setEmail(resultSet.getString("email"));
			  
			  
		 }
			  return employees;
		 
			
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return null;
		 
		
}
	public void updateEmployee(EmployeeDao employee) {
		// TODO Auto-generated method stub
		
	}
}

		
	
	 
		 
	 
		
	

	

	 

