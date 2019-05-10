package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.EmployeeModel;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.POST, value = "/addemployee")
	public ResponseEntity<EmployeeModel> addEmployee(@RequestBody EmployeeModel employee) {
		EmployeeModel status = employeeService.addemployee(employee);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/getemployeebyid")
	public Optional<EmployeeModel> getemployee(@RequestParam int employeeID) {

		// System.out.println(employeeID);
		return employeeService.getemployee(employeeID);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/getall")
	public List<EmployeeModel> getallemployee() {

		return employeeService.getallemployee();

	}

	@RequestMapping(method = RequestMethod.GET, value = "/getemployeebyiddelete")
	public String deleteemployee(@RequestParam int employeeID) {

		System.out.println(employeeID);
		return employeeService.deleteemployee(employeeID);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/getemployeebyname")
	public EmployeeModel checkemployeebeforepersist(@RequestParam String employeeName) {

		// System.out.println(employeeID);
		return employeeService.checkemployeebeforepersist(employeeName);
	}

}
