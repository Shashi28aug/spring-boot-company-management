package com.example.department.service;

public class EmployeeDetails {

    private String id;
    private String name;
    private String details;

    private String departmentId;

    public EmployeeDetails() {
    }

    public EmployeeDetails(String id, String name, String details, String departmentId) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.departmentId = departmentId;
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

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
}
