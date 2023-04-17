package com.Project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Emp_System")
public class Employee {
	
	@Id
	private int Id;
	private String Name;
	private String Department;
	private double Salary;
		
	public Employee() {
		super();
	}
	public Employee(int id, String name, String department, double salary) {
		super();
		Id = id;
		Name = name;
		Department = department;
		Salary = salary;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Department=" + Department + ", Salary=" + Salary + "]";
	}
	
}
