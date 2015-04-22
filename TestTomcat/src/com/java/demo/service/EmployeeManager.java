package com.java.demo.service;

import java.util.List;

import com.java.demo.model.DepartmentEntity;
import com.java.demo.model.EmployeeEntity;

public interface EmployeeManager 
{
	public List<EmployeeEntity> getAllEmployees();
	public List<DepartmentEntity> getAllDepartments();
	public void addEmployee(EmployeeEntity employee);
}
