package com.example.department.service;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
public class DepartmentDetails {

    @Id
    private String id;
    private String name;
    private String details;
    private String companyId;
    @Transient
    private List<EmployeeDetails> employeeDetails = new ArrayList();

    public DepartmentDetails() {
    }

    public DepartmentDetails(String id, String name, String details, String companyId) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.companyId = companyId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public List<EmployeeDetails> getEmployeeDetails() {
        return employeeDetails;
    }

    public void setEmployeeDetails(List<EmployeeDetails> employeeDetails) {
        this.employeeDetails = employeeDetails;
    }
}
