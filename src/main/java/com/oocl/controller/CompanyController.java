package com.oocl.controller;

import com.oocl.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.oocl.repository.CompanyRepositpry;

@RestController
public class CompanyController {

    @Autowired
    private CompanyRepositpry companyRepositpry;

    @PostMapping("/companise")
    public Company add(@RequestBody Company company){
        return companyRepositpry.save(company);
    }
}
