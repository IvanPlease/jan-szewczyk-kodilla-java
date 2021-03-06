package com.kodilla.hibernate.manytomany.repository;

import com.kodilla.hibernate.manytomany.dao.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface EmployeesRepository extends CrudRepository<Employee, Integer> {
    @Query
    List<Employee> retrieveEmployeeWithSurname(@Param("SURNAME") String surname);
    @Query
    List<Employee> retrieveEmployeeWithLettersInSurname(@Param("SEARCH_TERM") String searchTerm);
}
