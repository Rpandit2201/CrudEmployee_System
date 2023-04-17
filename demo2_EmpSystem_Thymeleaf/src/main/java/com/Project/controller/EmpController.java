package com.Project.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Project.entity.Employee;
import com.Project.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	private EmpService service;
	
	@GetMapping("/")
	public String HomePage(Model m) {
		List<Employee> emp=service.getAllEmp();
		m.addAttribute("emp",emp);		
		return "indexhtml";
		
	}
	@GetMapping("/AddEmp")
	public String AddEmp() {
		return "Add_Emp";
		
	}
	@PostMapping("/register")
	public String EmpRegister (@ModelAttribute Employee e,HttpSession session) {
		System.out.println(e);
		service.AddEmployee(e);
		session.setAttribute("msg","Employee Added Successfully...");
		return "redirect:/"; //after fire this will going to index.html
		
	}
	@GetMapping("/Edit/{Id}")
	public String Edit(@PathVariable int Id,Model m) {
		Employee e=service.GetEmpById(Id);
		m.addAttribute("emp", e);
		return "Edit";
	
		
	}
	//update
	@PostMapping("/update")
	public String updateEmp(@ModelAttribute Employee e,HttpSession session) {
		service.AddEmployee(e);
		session.setAttribute("msg", "Emp Data Update Successfully..");
		return "redirect:/";
	}
	//Delete
	@GetMapping("/delete/{Id}")
	public String deleteEmp(@PathVariable int Id,HttpSession session) {
		service.deleteEmp(Id);
		session.setAttribute("msg", "Emp Data Delete Successfully..");
		return "redirect:/";
	}


}
