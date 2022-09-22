package com.GADJET.Sprint_3_4.repositories;

import com.GADJET.Sprint_3_4.entities.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface enterpriseRepository extends JpaRepository<Enterprise, Long> {
}
