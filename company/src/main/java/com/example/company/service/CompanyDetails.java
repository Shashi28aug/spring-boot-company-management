package com.example.company.service;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CompanyDetails {

    @Id
    private String id;
    private String name;
    private String details;

    @Transient
    private List<DepartmentDetails> departmentDetails = new ArrayList<>();

    public CompanyDetails() {
    }

    public CompanyDetails(String id, String name, String details) {
        this.id = id;
        this.name = name;
        this.details = details;
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

    public List<DepartmentDetails> getDepartmentDetails() {
        return departmentDetails;
    }

    public void setDepartmentDetails(List<DepartmentDetails> departmentDetails) {
        this.departmentDetails = departmentDetails;
    }
}
