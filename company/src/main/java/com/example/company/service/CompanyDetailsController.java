package com.example.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyDetailsController {

    @Autowired
    private CompanyDetailsService companyDetailsService;

    @RequestMapping("/getDetails")
    public List<CompanyDetails> getCompanyDetails() {
        return companyDetailsService.getCompanyDetails();
    }

    @RequestMapping("/getDetails/{id}")
    public CompanyDetails getCompanyDetailsById(@PathVariable String id) {
        return companyDetailsService.getCompanyDetailsById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addDetails")
    public void addCompanyDetails(@RequestBody CompanyDetails companyDetails) {
        companyDetailsService.addCompanyDetails(companyDetails);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/addDetails/{id}")
    public void  updateCompanyDetails(@RequestBody CompanyDetails companyDetails, @PathVariable String id) {
        companyDetailsService.updateCompanyDetails(companyDetails, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteDetails/{id}")
    public void deleteCompanyDetails(@PathVariable String id) {
        companyDetailsService.deleteCompanyDetails(id);
    }
}
