package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Employee;
import com.example.demo.service.ServiceImpl;

@RestController

@CrossOrigin("http://localhost:4200")

public class RestController1 
{
	@Autowired
	ServiceImpl serviceobj;

	//Create Employee
	@PostMapping("/EmployeeCreation")
	public Employee EmployeeCreation(@RequestBody Employee emp)
	{
		return serviceobj.EmployeeCreation(emp);
	}

	//Get Particular Employee Data
	@GetMapping("/GetEmployee/{id}")
	private ResponseEntity<Employee> getEmployee(@PathVariable("id") int id) 
	{
		Employee emp = serviceobj.getEmployeeById(id);
		if(emp == null) {
			ResponseEntity<Employee>  responseEntity = new ResponseEntity<Employee>(emp,HttpStatus.OK);
			return responseEntity;
		}
		else {
			ResponseEntity<Employee>  responseEntity = new ResponseEntity<Employee>(emp,HttpStatus.OK);
			return responseEntity;
		}
	}

	//Get All Employees Data
	@GetMapping("/GetAllEmployees")
	private List<Employee> getAllEmployee() 
	{
		return serviceobj.getAllEmployee();
	}

	//Updating Employee data
	@PutMapping("/UpdateEmployee")
	public ResponseEntity<String> UpdateEmployee(@RequestBody Employee emp)
	{ 
		String message = serviceobj.UpdateEmployee(emp);
		ResponseEntity<String> responseEntity = new ResponseEntity<String>(message,HttpStatus.OK);
		return responseEntity;
	}

	//Deleting Employee
	@DeleteMapping("/DeleteEmployee/{id}")
	private  ResponseEntity<String> delEmp(@PathVariable("id") int id) 
	{
		String message = serviceobj.delete(id);
		ResponseEntity<String>responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		return responseEntity;
	}

}