package com.example.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/{departmentId}/getDetails")
    public List<EmployeeDetails> getEmployeeDetails(@PathVariable String departmentId) {
        return employeeService.getEmployeeDetails(departmentId);
    }

    @RequestMapping("/{departmentId}/getDetails/{id}")
    public EmployeeDetails getEmployeeDetailsById(@PathVariable String id, @PathVariable String departmentId) {
        return employeeService.getEmployeeDetailsById(id, departmentId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{departmentId}/addDetails")
    public void addEmployeeDetails(@RequestBody EmployeeDetails employeeDetails, @PathVariable String departmentId) {
        employeeService.addEmployeeDetails(employeeDetails, departmentId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{departmentId}/addDetails/{id}")
    public void  updateEmployeeDetails(@RequestBody EmployeeDetails employeeDetails, @PathVariable String id, @PathVariable String departmentId) {
        employeeService.updateEmployeeDetails(employeeDetails, id, departmentId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{departmentId}/deleteDetails/{id}")
    public void deleteEmployeeDetails(@PathVariable String id, @PathVariable String departmentId) {
        employeeService.deleteEmployeeDetails(id, departmentId);
    }
}
