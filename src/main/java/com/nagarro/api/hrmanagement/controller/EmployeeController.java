package com.nagarro.api.hrmanagement.controller;

import java.util.List;
import java.util.Optional;

import com.nagarro.api.hrmanagement.model.EmployeeDetails;
import com.nagarro.api.hrmanagement.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;


    // For Fetching All Employee
    @GetMapping("/allEmp")
    public ResponseEntity<List<EmployeeDetails>> getAllEmployee(){
        List<EmployeeDetails> employeeDetails=this.employeeService.getAllEmployee();
        return ResponseEntity.of(Optional.of(employeeDetails));
    }

    // For Save an employee
    @PostMapping("/saveEmployee")
	public void  saveEmployee(@RequestBody EmployeeDetails empdata ) {
		System.out.println("saved");
		this.employeeService.saveEmployee(empdata);
	}


    // For Delete an particular Employee data
    @DeleteMapping("/deleteEmployee/{empId}")
	public void deleteEmployee(@PathVariable("empId") int empId) {
		this.employeeService.deleteEmployeeById(empId);
		System.out.println("deleted");
	}

    // For Updating The particular Employee
    @PutMapping("/updateEmp/{empId}")
    public EmployeeDetails updateEmployee(@RequestBody EmployeeDetails empData , @PathVariable("empId") int empId){
        this.employeeService.updateEmployee(empData,empId);
        System.out.println("Updated");
        return empData;
        
    }

}
