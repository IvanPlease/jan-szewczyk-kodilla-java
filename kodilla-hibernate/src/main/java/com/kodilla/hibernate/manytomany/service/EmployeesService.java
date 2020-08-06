package com.kodilla.hibernate.manytomany.service;

import com.kodilla.hibernate.manytomany.dao.EmployeeDto;
import com.kodilla.hibernate.manytomany.mapper.CompanyMapper;
import com.kodilla.hibernate.manytomany.repository.EmployeesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesService {
    private final EmployeesRepository repository;
    private final CompanyMapper mapper;

    public EmployeesService(EmployeesRepository repository, CompanyMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<EmployeeDto> getEmployeesWithLettersInName(String search_word){
        return mapper.mapToEmployeeDtoList(repository.retrieveEmployeeWithLettersInSurname(search_word));
    }

    public List<EmployeeDto> getEmployeesWithSurname(String surname){
        return mapper.mapToEmployeeDtoList(repository.retrieveEmployeeWithSurname(surname));
    }
}
