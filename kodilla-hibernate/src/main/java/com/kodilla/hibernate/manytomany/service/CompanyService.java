package com.kodilla.hibernate.manytomany.service;

import com.kodilla.hibernate.manytomany.dao.CompanyDto;
import com.kodilla.hibernate.manytomany.dao.EmployeeDto;
import com.kodilla.hibernate.manytomany.mapper.CompanyMapper;
import com.kodilla.hibernate.manytomany.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    private final CompanyRepository repository;
    private final CompanyMapper mapper;

    public CompanyService(CompanyRepository repository, CompanyMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<CompanyDto> getCompanyWithFirstLetters(String first_letters){
        return mapper.mapToCompanyDtoList(repository.retrieveCompanyWithFirstLetters(first_letters));
    }

    public List<CompanyDto> getCompanyWithLettersInName(String search_word){
        return mapper.mapToCompanyDtoList(repository.retrieveCompanyWithLettersInName(search_word));
    }
}
