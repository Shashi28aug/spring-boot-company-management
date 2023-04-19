package com.example.employee.service;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeDetails, String> {
}
