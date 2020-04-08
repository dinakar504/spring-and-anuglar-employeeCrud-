package com.example.demo.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DaoClass;
import com.example.demo.entites.Employee;

@Service
@Transactional


public class ServiceImpl {
	
	@Autowired
	DaoClass dao;

	public Employee EmployeeCreation(Employee emp) {
		return dao.createEmployee(emp);
	}

	public Employee getEmployeeById(int id) 
	{
	return dao.getEmployeeById(id);
	}

	public List<Employee> getAllEmployee() 
	{
	return dao.getAllEmployee();
	}

	public String delete(int id) 
	{
		return dao.deleteEmp(id);
	}

	public String UpdateEmployee(Employee emp) {
		return dao.UpdateEmployee(emp);	
	}
}
