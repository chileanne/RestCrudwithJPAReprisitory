package com.example.RestCrudwithJPAReprisitory.service;



import com.example.RestCrudwithJPAReprisitory.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save (Employee theEmployee);

    void deleteById(int theID);
}
