package com.capg.anuraag.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.anuraag.dao.EmployeeDaoI;
import com.capg.anuraag.entity.EmployeeDet;
@Service
public class EmployeeService implements EmployeeServiceI {
@Autowired
EmployeeDaoI dao;
@Override
	public String createAccount(EmployeeDet emp) {
			dao.save(emp);
			return "inserted";
		 
	}
	@Override
	public Optional<EmployeeDet> findById(int id) {
		
		return dao.findById(id);
		
	
	}
	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		 dao.deleteById(id);
		 return "deleted";
	}
	@Override
	public List fetchAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public String updateEmp(EmployeeDet emp) {
		// TODO Auto-generated method stub
		boolean b=dao.existsById(emp.getId());
		if(b) {
			dao.save(emp);
			return "updated succesfully";
		}
		return "No such record";
	}

}
