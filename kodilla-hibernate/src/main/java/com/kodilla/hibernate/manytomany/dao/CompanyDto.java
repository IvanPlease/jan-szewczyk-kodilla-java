package com.kodilla.hibernate.manytomany.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class CompanyDto {
    private int id;
    private String name;
    private List<EmployeeDto> employees;
}
