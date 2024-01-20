package com.example.springexample.controller;

import com.example.springexample.entity.Employee;
import com.example.springexample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService _employeeService;

    @GetMapping("/form")
    public String getForm(ModelMap modelMap) {
        String view = "formEmployee";
        try {
            Employee employee = new Employee();
            modelMap.addAttribute("employee", employee);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return view;
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute("employee") Employee employee, ModelMap modelMap) {
        String view = "redirect:/employee/list";
        try {
            if (employee.getId() == null) {
                _employeeService.createEmployee(employee);
            } else {
                _employeeService.updateEmployee(employee);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return view;
    }

    @GetMapping("list")
    public String getList(ModelMap modelMap) {
        String view = "listEmployee";
        try {
            List<Employee> employees = _employeeService.findAllEmployees();
            modelMap.addAttribute("employees", employees);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return view;
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") Long id) {
        _employeeService.deleteEmployee(id);
        return "redirect:/employee/list";
    }

    @GetMapping("/edit/{id}")
    public String editEmployee(@PathVariable("id") Long id, ModelMap modelMap) {
        Employee employee = _employeeService.findEmployeeById(id);
        modelMap.addAttribute("employee", employee);
        return "formEmployee";
    }
}
