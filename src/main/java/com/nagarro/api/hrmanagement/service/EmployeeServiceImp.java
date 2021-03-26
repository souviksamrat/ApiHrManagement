package com.nagarro.api.hrmanagement.service;

import java.util.List;
import java.util.Optional;

import com.nagarro.api.hrmanagement.model.EmployeeDetails;
import com.nagarro.api.hrmanagement.repo.EmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
	private EmployeeRepo empRepo;
	
	
	@Override
	public List<EmployeeDetails> getAllEmployee() {
		
		return this.empRepo.findAll();
	}

	@Override
	public void saveEmployee(EmployeeDetails employeeDetails) {
		
		this.empRepo.save(employeeDetails);
	}

	@Override
	public void updateEmployee(EmployeeDetails employeeDetails,long id) {

		Optional<EmployeeDetails> empData=this.empRepo.findById(id);
	 	EmployeeDetails data=null;
		 if(empData.isPresent()){
			 data=employeeDetails;
		 }
		this.empRepo.save(data);
		
	}

	@Override
	public void deleteEmployeeById(long id) {
		
		this.empRepo.deleteById(id);
	}
	

	// public EmployeeDetails getEmployeeById(long id){
	// 	Optional<EmployeeDetails> employeeDetails=this.empRepo.findById(id);
	// 	EmployeeDetails data=null;
	// 	if(employeeDetails.isPresent()) {
	// 		data=employeeDetails.get();
	// 	}
	// 	return  data;
	// }
}
