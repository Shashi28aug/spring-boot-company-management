package com.example.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyDetailsService {

    @Autowired
    private CompanyDetailsRepository companyDetailsRepository;

    @Autowired
    RestTemplate restTemplate;

    public List<CompanyDetails> getCompanyDetails() {
        List<CompanyDetails> companyDetails = new ArrayList<>();

        companyDetailsRepository.findAll().forEach(c -> {
            List<DepartmentDetails> departmentDetails = restTemplate.getForObject("http://department/department/"+c.getId()+"/getDetails", ArrayList.class);
            c.setDepartmentDetails(departmentDetails);
            companyDetails.add(c);
        });
        return companyDetails;
    }

    public CompanyDetails getCompanyDetailsById(String id) {
        CompanyDetails companyDetails = companyDetailsRepository.findById(id).get();
        List<DepartmentDetails> departmentDetails = restTemplate.getForObject("http://department/department/"+companyDetails.getId()+"/getDetails", ArrayList.class);
        companyDetails.setDepartmentDetails(departmentDetails);
        return companyDetails;
    }

    public void addCompanyDetails(CompanyDetails companyDetails) {
        companyDetailsRepository.save(companyDetails);
    }

    public void updateCompanyDetails(CompanyDetails companyDetails, String id) {
        companyDetailsRepository.save(companyDetails);
    }

    public void deleteCompanyDetails(String id) {
        companyDetailsRepository.deleteById(id);
    }
}
