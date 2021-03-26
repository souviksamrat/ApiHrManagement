package com.nagarro.api.hrmanagement.service;

import java.util.List;

import com.nagarro.api.hrmanagement.model.EmployeeDetails;

public interface EmployeeService {
    public List<EmployeeDetails> getAllEmployee();
	public void saveEmployee(EmployeeDetails employeeDetails);
	public void  updateEmployee(EmployeeDetails employeeDetails,long id);
	public void deleteEmployeeById(long id);
}
