package com.nagarro.api.hrmanagement.repo;

import com.nagarro.api.hrmanagement.model.EmployeeDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeDetails,Long> {
    
}
