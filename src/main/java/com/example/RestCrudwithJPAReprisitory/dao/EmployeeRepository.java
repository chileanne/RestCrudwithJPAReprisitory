package com.example.RestCrudwithJPAReprisitory.dao;

import com.example.RestCrudwithJPAReprisitory.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
