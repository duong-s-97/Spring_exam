package com.example.springexample.service.impl;

import com.example.springexample.entity.Employee;
import com.example.springexample.repository.EmployeeRepository;
import com.example.springexample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository _employeeRepository;
    @Override
    public void createEmployee(Employee employee) {
        try {
            _employeeRepository.save(employee);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Employee> findAllEmployees() {
        return _employeeRepository.findAll();
    }
    @Override
    public void deleteEmployee(Long id) {
        _employeeRepository.deleteById(id);
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return _employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void updateEmployee(Employee employee) {
        _employeeRepository.save(employee);
    }
}
