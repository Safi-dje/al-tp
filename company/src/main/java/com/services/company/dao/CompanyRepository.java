package com.services.company.dao;

import com.services.company.Entities.Company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
