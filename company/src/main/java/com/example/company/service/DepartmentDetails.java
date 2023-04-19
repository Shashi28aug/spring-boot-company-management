package com.example.company.service;

public class DepartmentDetails {

    private String id;
    private String name;
    private String details;
    private String companyId;

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

    public String companyId() {
        return companyId;
    }

    public void companyId(String companyId) {
        this.companyId = companyId;
    }
}
