package com.kodilla.hibernate.manytomany.repository;

import com.kodilla.hibernate.manytomany.dao.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer> {
    @Query
    List<Company> retrieveCompanyWithFirstLetters(@Param("FIRSTLETTERS") String firstLetters);
    @Query
    List<Company> retrieveCompanyWithLettersInName(@Param("SEARCH_TERM") String searchTerm);
}