package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
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
public class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeesRepository employeesRepository;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testRetrieveCompanyWithFirstLetters(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Company company = new Company("Test company");
        Company company1 = new Company("Test2 company");
        Company company2 = new Company("Test3 company");
        Employee sEmployee1 = employeesRepository.save(johnSmith);
        Employee sEmployee2 = employeesRepository.save(stephanieClarckson);
        Employee sEmployee3 = employeesRepository.save(lindaKovalsky);
        Company sCompany1 = companyDao.save(company);
        Company sCompany2 = companyDao.save(company1);
        Company sCompany3 = companyDao.save(company2);
        //When
        List<Employee> employeesList = employeesRepository.retrieveEmployeeWithSurname("Smith");
        List<Company> companiesList = companyDao.retrieveCompanyWithFirstLetters("Tes");
        //Then
        Assert.assertEquals(5, employeesList.size());
        Assert.assertEquals(15, companiesList.size());
        //Cleanup
        try{
            companyDao.deleteById(sCompany1.getId());
            companyDao.deleteById(sCompany2.getId());
            companyDao.deleteById(sCompany3.getId());
            employeesRepository.deleteById(sEmployee1.getId());
            employeesRepository.deleteById(sEmployee2.getId());
            employeesRepository.deleteById(sEmployee3.getId());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}