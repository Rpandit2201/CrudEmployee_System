package com.Project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.Repository.EmpRepository;
import com.Project.entity.Employee;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepository repo;
	public void AddEmployee(Employee e) {
		repo.save(e);
	}
	public List<Employee> getAllEmp(){
		return repo.findAll();
	}
	public Employee GetEmpById(int Id) {
		Optional<Employee> e=repo.findById(Id);
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}	
	public void deleteEmp(int Id) {
		repo.deleteById(Id);
	}

}
