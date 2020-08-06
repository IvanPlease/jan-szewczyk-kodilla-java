package com.kodilla.hibernate.manytomany.mapper;

import com.kodilla.hibernate.manytomany.dao.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDto;
import com.kodilla.hibernate.manytomany.dao.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDto;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class CompanyMapper {
    public Company mapToCompany(CompanyDto companyDto){
        return new Company(companyDto.getName());
    }
    public CompanyDto mapToCompanyDto(Company company){
        return new CompanyDto(company.getId(), company.getName(), mapToEmployeeDtoList(company.getEmployees()));
    }
    public Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(employeeDto.getFirstname(), employeeDto.getLastname());
    }
    public EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(employee.getId(), employee.getFirstname(), employee.getLastname(), mapToCompanyDtoList(employee.getCompanies()));
    }
    public List<Company> mapToCompanyList(List<CompanyDto> employeeDtos){
        return employeeDtos.stream()
                .map(this::mapToCompany)
                .collect(toList());
    }
    public List<CompanyDto> mapToCompanyDtoList(List<Company> employees){
        return employees.stream()
                .map(this::mapToCompanyDto)
                .collect(toList());
    }
    public List<Employee> mapToEmployeeList(List<EmployeeDto> employeeDtos){
        return employeeDtos.stream()
                .map(this::mapToEmployee)
                .collect(toList());
    }
    public List<EmployeeDto> mapToEmployeeDtoList(List<Employee> employees){
        return employees.stream()
                .map(this::mapToEmployeeDto)
                .collect(toList());
    }
}
