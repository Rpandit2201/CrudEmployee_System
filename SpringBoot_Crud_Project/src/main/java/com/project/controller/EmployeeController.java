	package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.Employee;
import com.project.service.EmployeeService;

import lombok.var;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	
	@RequestMapping("/")
	private String gotoHomePage() {
		return "home.jsp";
	}
	//its 1st relate with addEmployee.jsp
	@RequestMapping(value="add-employee",method=RequestMethod.POST)
	public String saveEmployee(HttpServletRequest request) {
		Employee emp=new Employee(Integer.parseInt(request.getParameter("empid")),request.getParameter("name"),Integer.parseInt(request.getParameter("age")),Double.parseDouble(request.getParameter("salary")));
		service.saveEmployee(emp);
		return "home.jsp";
	}
	
	@RequestMapping("/getEmployee")
	public ModelAndView getAllEmployees() {
		List<Employee> list=service.getAllEmployee();
		ModelAndView mv=new ModelAndView();
		mv.addObject("list",list);
		mv.setViewName("getEmployee.jsp");
		return mv;
	}
	
	@RequestMapping(value="/delete/{empid}")
	public ModelAndView deleteEmployeeById(@PathVariable int empid){
		service.deleteEmployee(empid);
		return new ModelAndView("redirect:/home.jsp");
	}
	
	//this method i'm using for update the form (means using this our form get all requirement data by label name of form)
	 @RequestMapping(value="/update",method=RequestMethod.GET) 
	  public ModelAndView updateForm(HttpServletRequest request) {
	  Employee emp1=null;
	  int empid=Integer.parseInt(request.getParameter("empid")); 
	  var details=service.finfByID(empid); // i'm use Lombok
	  if(details.isPresent()) { 
		  emp1=details.get(); 
	  } 
	  else
	  {
	  System.out.println("Employee doesn't exists");
	  }
	  ModelAndView mv=new ModelAndView();
	  mv.addObject("employee",emp1);
	  mv.setViewName("updateEmployee.jsp");
	  return mv;
	  }
	 
	 //this method is using to update the employee which data is get in form
	 @RequestMapping(value="updateEmployee",method=RequestMethod.POST)
	 public String updateEmployee(HttpServletRequest request) {
		 Employee emp2=new Employee();
		 emp2.setEmpid(Integer.parseInt(request.getParameter("empid")));
		 emp2.setName(request.getParameter("name"));
		 emp2.setAge(Integer.parseInt(request.getParameter("age")));
		 emp2.setSalary(Double.parseDouble(request.getParameter("salary")));
		 service.saveEmployee(emp2);
		 return "home.jsp";
	 }
}
