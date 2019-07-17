package com.oocl.repository;


import com.oocl.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepositpry extends JpaRepository<Company, Integer> {
}
