package com.GADJET.Sprint_3_4.controllers;

import com.GADJET.Sprint_3_4.entities.Employee;
import com.GADJET.Sprint_3_4.services.employeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")

public class employeeControllers {

    @Autowired
    employeeServices EMPS1;

    public employeeControllers(employeeServices EMPS1) {
        this.EMPS1 = EMPS1;
    }

    @GetMapping
    public ResponseEntity<List<Employee>> EnterList(){
        return EMPS1.getEmployee();
    }

    @RequestMapping(value = "{employeeId}")
    public ResponseEntity<Employee> REE1(@PathVariable("employeeId") Long EmployeeId){
        return EMPS1.getEmployeeById(EmployeeId);
    }

    @PostMapping
    public ResponseEntity<Employee> REE2(@RequestBody Employee empl){
        return EMPS1.createEmployee(empl);
    }

    @DeleteMapping(value = "{employeeId}")
    public ResponseEntity<Void> REE3(@PathVariable("employeeId") Long employeeId){
        return EMPS1.deleteEmployee(employeeId);
    }

    @PutMapping
    public ResponseEntity<Employee> REE4(@RequestBody Employee empl){
        return EMPS1.updateEmployee(empl);
    }
}
