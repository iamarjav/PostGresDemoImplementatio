package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.EmployeeModel;

public interface EmployeeService {

	EmployeeModel addemployee(EmployeeModel employee);

	Optional<EmployeeModel> getemployee(int employeeID);

	List<EmployeeModel> getallemployee();

	String deleteemployee(int employeeID);

	EmployeeModel checkemployeebeforepersist(String employeeName);

}
