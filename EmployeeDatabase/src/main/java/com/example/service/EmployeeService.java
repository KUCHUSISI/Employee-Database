package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

public class EmployeeService 
{
	@Autowired
	EmployeeRepository employeeRepository;
	public List<Employee> getAllEmployee()
	{
		List<Employee> employee=new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employee1 ->employee.add(employee1));
		return employee;
	}
	public Employee getEmployeeById(int id)
	{
		return employeeRepository.findById(id).get();
	}
	public void save(Employee employee)
	{
		employeeRepository.save(employee);
	}
	public void delete(int id)
	{
		employeeRepository.deleteById(id);
	}
	public void update(Employee employee)
	{
		employeeRepository.save(employee);
	}
}
