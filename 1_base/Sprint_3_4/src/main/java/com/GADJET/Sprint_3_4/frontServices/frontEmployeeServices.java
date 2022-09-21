package com.GADJET.Sprint_3_4.frontServices;

import com.GADJET.Sprint_3_4.entities.Employee;
import com.GADJET.Sprint_3_4.repositories.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class frontEmployeeServices {

    @Autowired
    private employeeRepository employeeRepository2;

    public List<Employee> getAllEmployees() {
        return employeeRepository2.findAll();
    }

    public void saveEmployee(Employee employee) {
        this.employeeRepository2.save(employee);
    }

    public Employee getEmployeeById(long id) {
        Optional<Employee> optional = employeeRepository2.findById(id);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return employee;
    }

    public void deleteEmployeeById(long id) {
        this.employeeRepository2.deleteById(id);
    }
}
