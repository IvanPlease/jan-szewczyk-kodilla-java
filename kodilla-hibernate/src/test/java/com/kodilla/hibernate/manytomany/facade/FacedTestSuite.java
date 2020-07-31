package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.repository.EmployeesRepository;
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
public class FacedTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeesRepository employeesRepository;
    @Test
    public void retrieveEmployeeWithLettersInSurname(){
        List<Employee> result = employeesRepository.retrieveEmployeeWithLettersInSurname("mith");
        Assert.assertEquals(6, result.size());
    }
    @Test
    public void retrieveCompanyWithLettersInName(){
        List<Company> companies = companyDao.retrieveCompanyWithLettersInName("comp");
        Assert.assertEquals(18, companies.size());
    }
}
