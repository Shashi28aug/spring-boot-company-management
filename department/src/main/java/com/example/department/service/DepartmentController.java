package com.example.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/{companyId}/getDetails")
    public List<DepartmentDetails> getDepartmentDetails(@PathVariable String companyId) {
        return departmentService.getDepartmentDetails(companyId);
    }

    @RequestMapping("/{companyId}/getDetails/{id}")
    public DepartmentDetails getDepartmentDetailsById(@PathVariable String id, @PathVariable String companyId) {
        return departmentService.getDepartmentDetailsById(id, companyId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{companyId}/addDetails")
    public void addDepartmentDetails(@RequestBody DepartmentDetails departmentDetails, @PathVariable String companyId) {
        departmentService.addDepartmentDetails(departmentDetails, companyId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{companyId}/addDetails/{id}")
    public void  updateDepartmentDetails(@RequestBody DepartmentDetails departmentDetails, @PathVariable String id, @PathVariable String companyId) {
        departmentService.updateDepartmentDetails(departmentDetails, id, companyId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{companyId}/deleteDetails/{id}")
    public void deleteDepartmentDetails(@PathVariable String id, @PathVariable String companyId) {
        departmentService.deleteDepartmentDetails(id, companyId);
    }
}
