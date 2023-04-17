package com.Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee,Integer>{

}
