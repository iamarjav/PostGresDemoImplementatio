package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.EmployeeModel;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {

	@Query("select c from com.example.model.EmployeeModel c where c.employeeName= :employeeName")
	EmployeeModel checkemployeebeforepersist(String employeeName);
}
