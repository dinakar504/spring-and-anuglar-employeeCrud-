package com.capg.anuraag.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.anuraag.entity.EmployeeDet;
@Repository

public interface EmployeeDaoI  extends JpaRepository<EmployeeDet, Integer>{
	

}
