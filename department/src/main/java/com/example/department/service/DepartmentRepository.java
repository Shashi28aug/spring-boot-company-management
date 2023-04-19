package com.example.department.service;

import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<DepartmentDetails, String> {
}
