package com.example.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.EmployeeModel;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public EmployeeModel addemployee(EmployeeModel employee) {
		// TODO Auto-generated method stub
		Date employeedate = new Date();
		employee.setDate(employeedate);
		EmployeeModel returnstatus = employeeRepository.save(employee);
		return returnstatus;
	}

	@Override
	public Optional<EmployeeModel> getemployee(int employeeID) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(employeeID);
	}

	@Override
	public List<EmployeeModel> getallemployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public String deleteemployee(int employeeID) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(employeeID);
		return "Deleted";

	}

	@Override
	public EmployeeModel checkemployeebeforepersist(String employeeName) {
		// TODO Auto-generated method stub
		EmployeeModel obtainedResult = employeeRepository.checkemployeebeforepersist(employeeName);

		obtainedResult.setEmployeeName("VIcky");
		employeeRepository.save(obtainedResult);
		return obtainedResult;

	}

}
