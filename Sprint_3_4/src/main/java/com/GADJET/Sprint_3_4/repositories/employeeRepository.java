package com.GADJET.Sprint_3_4.repositories;

import com.GADJET.Sprint_3_4.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepository extends JpaRepository<Employee, Long> {
}
