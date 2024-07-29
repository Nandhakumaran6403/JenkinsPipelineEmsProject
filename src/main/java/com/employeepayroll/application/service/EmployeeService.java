package com.employeepayroll.application.service;

import java.util.List;
import com.employeepayroll.application.model.Employee;

public interface EmployeeService {
	public Employee getEmployeeById(int id);

	public Employee saveEmployee(Employee employee);

	public void deleteEmployee(int id);

	public Employee updateEmployee(int id, Employee updatedEmployee); 

	public List<Employee> getAllEmployees();
}
