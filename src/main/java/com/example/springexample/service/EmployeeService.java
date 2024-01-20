package com.example.springexample.service;


import com.example.springexample.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void createEmployee(Employee employee);
    void deleteEmployee(Long id);
    void updateEmployee(Employee employee);
    List<Employee> findAllEmployees();
    Employee findEmployeeById(Long id);
}
