package com.java.demo.dao;

import java.util.List;

import com.java.demo.model.DepartmentEntity;
import com.java.demo.model.EmployeeEntity;

public interface EmployeeDAO 
{
	public List<EmployeeEntity> getAllEmployees();
	public List<DepartmentEntity> getAllDepartments();
	public void addEmployee(EmployeeEntity employee);
}