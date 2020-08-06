package com.kodilla.hibernate.manytomany.controller;

import com.kodilla.hibernate.manytomany.dao.CompanyDto;
import com.kodilla.hibernate.manytomany.dao.EmployeeDto;
import com.kodilla.hibernate.manytomany.facade.SearchFacade;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/search")
public class SearchController {
    private final SearchFacade facade;

    public SearchController(SearchFacade facade) {
        this.facade = facade;
    }

    @GetMapping(value = "/company/{searchString}", produces = APPLICATION_JSON_VALUE)
    public List<CompanyDto> getCompanyWithLetters(@PathVariable String searchString){
        return facade.searchByLettersInCompanyName(searchString);
    }

    @GetMapping(value = "/employee/{searchString}", produces = APPLICATION_JSON_VALUE)
    public List<EmployeeDto> getEmployeeWithLetters(@PathVariable String searchString){
        return facade.searchByLettersInEmployeeName(searchString);
    }

}
