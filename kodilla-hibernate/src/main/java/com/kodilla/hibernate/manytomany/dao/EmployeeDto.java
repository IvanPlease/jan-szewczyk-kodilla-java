package com.kodilla.hibernate.manytomany.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class EmployeeDto {
    private int id;
    private String firstname;
    private String lastname;
    private List<CompanyDto> companies;
}
