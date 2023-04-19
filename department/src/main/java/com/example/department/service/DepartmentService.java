package com.example.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private RestTemplate restTemplate;

    public List<DepartmentDetails> getDepartmentDetails(String companyId) {
        List<DepartmentDetails> departmentDetails = new ArrayList<>();
        departmentRepository.findAll().forEach(d -> {
            if(d.getCompanyId().equals(companyId)){
                List<EmployeeDetails> employeeDetailsList = restTemplate.getForObject("http://employee/employee/"+d.getId()+"/getDetails", ArrayList.class);
                d.setEmployeeDetails(employeeDetailsList);
                departmentDetails.add(d);
            }
        });
        return departmentDetails;
    }

    public DepartmentDetails getDepartmentDetailsById(String id, String companyId) {
        DepartmentDetails departmentDetails = departmentRepository.findById(id).get();
        List<EmployeeDetails> employeeDetailsList = restTemplate.getForObject("http://employee/employee/"+departmentDetails.getId()+"/getDetails", ArrayList.class);
        departmentDetails.setEmployeeDetails(employeeDetailsList);
        return departmentDetails;
    }

    public void addDepartmentDetails(DepartmentDetails departmentDetails, String companyId) {
        departmentRepository.save(departmentDetails);
    }

    public void updateDepartmentDetails(DepartmentDetails departmentDetails, String id, String companyId) {
        departmentRepository.save(departmentDetails);
    }

    public void deleteDepartmentDetails(String id, String companyId) {
        departmentRepository.deleteById(id);
    }
}
