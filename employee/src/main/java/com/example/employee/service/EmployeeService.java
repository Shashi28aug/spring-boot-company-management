package com.example.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    public List<EmployeeDetails> getEmployeeDetails(String departmentId) {
        List<EmployeeDetails> employeeDetails = new ArrayList<>();
        employeeRepository.findAll().forEach(e -> {
            if(e.getDepartmentId().equals(departmentId))
                employeeDetails.add(e);
        });
        return employeeDetails;
    }

    public EmployeeDetails getEmployeeDetailsById(String id, String departmentId) {
        return employeeRepository.findById(id).get();
    }

    public void addEmployeeDetails(EmployeeDetails employeeDetails, String departmentId) {
        employeeRepository.save(employeeDetails);
    }

    public void updateEmployeeDetails(EmployeeDetails employeeDetails, String id, String departmentId) {
        employeeRepository.save(employeeDetails);
    }

    public void deleteEmployeeDetails(String id, String departmentId) {
        employeeRepository.deleteById(id);
    }

}
