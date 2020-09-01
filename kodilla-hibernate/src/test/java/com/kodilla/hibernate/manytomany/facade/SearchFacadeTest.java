package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.Company;
import com.kodilla.hibernate.manytomany.dao.Employee;
import com.kodilla.hibernate.manytomany.mapper.CompanyMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class SearchFacadeTest {

    @Autowired
    public SearchFacade searchFacade;
    @Autowired
    public CompanyMapper companyMapper;

    @Test
    public void retrieveCompaniesWithStringInName(){
        //Given
        List<Company> fetchedCompanies = companyMapper.mapToCompanyList(searchFacade.searchByLettersInCompanyName("comp"));
        //When
        int sizeOfCompanies = fetchedCompanies.size();
        //Then
        Assert.assertEquals(30, sizeOfCompanies);
    }
    @Test
    public void retrieveEmployeesWithStringInName(){
        //Given
        List<Employee> fetchedEmployees = companyMapper.mapToEmployeeList(searchFacade.searchByLettersInEmployeeName("mith"));
        //When
        int sizeOfEmployees = fetchedEmployees.size();
        //Then
        Assert.assertEquals(10, sizeOfEmployees);
    }
}