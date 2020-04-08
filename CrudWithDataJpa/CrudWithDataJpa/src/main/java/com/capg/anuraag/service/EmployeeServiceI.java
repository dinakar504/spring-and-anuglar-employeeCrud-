package com.capg.anuraag.service;

import java.util.List;
import java.util.Optional;

import com.capg.anuraag.entity.EmployeeDet;

public interface EmployeeServiceI {
	public String createAccount(EmployeeDet emp);

	public Optional<EmployeeDet> findById(int id);

	public String deleteById(int id);

	public List fetchAll();

	public String updateEmp(EmployeeDet emp);
}
