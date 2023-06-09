package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.model.Employees;
import com.project.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	public Employees saveEmployee(Employees employee) {
		return repo.save(employee);
	}
	
	//i want all employee in a single list thats why i'm using List
	public List<Employees> getAllEmployee(){
		return repo.findAll();
	}
	
	//this method i will using to update employee
	public Optional<Employees> finfByID(int empid){
		return repo.findById(empid);
	}
	
	public void deleteEmployee(int empid) {
		repo.deleteById(empid);
	}

}
