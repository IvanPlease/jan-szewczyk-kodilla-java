package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDto;
import com.kodilla.hibernate.manytomany.dao.EmployeeDto;
import com.kodilla.hibernate.manytomany.service.CompanyService;
import com.kodilla.hibernate.manytomany.service.EmployeesService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchFacade {
    public final CompanyService companyService;
    public final EmployeesService employeesService;

    public SearchFacade(CompanyService companyService, EmployeesService employeesService) {
        this.companyService = companyService;
        this.employeesService = employeesService;
    }

    public List<CompanyDto> searchByLettersInCompanyName(String searchString){
        return companyService.getCompanyWithLettersInName(searchString);
    }

    public List<EmployeeDto> searchByLettersInEmployeeName(String searchString){
        return employeesService.getEmployeesWithLettersInName(searchString);
    }

}
