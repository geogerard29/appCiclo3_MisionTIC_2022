package com.GADJET.Sprint_3_4.services;

import com.GADJET.Sprint_3_4.entities.Employee;
import com.GADJET.Sprint_3_4.repositories.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class employeeServices {

    @Autowired
    private employeeRepository employeeRepository1;

    //Constructor de employee repository

    public employeeServices(employeeRepository employeeRepository1) {
        this.employeeRepository1 = employeeRepository1;
    }

    // Metodo para obtener todos las empleados

    public ResponseEntity<List<Employee>> getEmployee(){
        List<Employee> employee2 = employeeRepository1.findAll();

        return ResponseEntity.ok(employee2);
    }

    // Metodo para obtener un empleado por su id
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("employeeId") Long employeeId){
        java.util.Optional<Employee> optionalEmployee = employeeRepository1.findById(employeeId);
        if (((java.util.Optional<Employee>) optionalEmployee).isPresent()){
            return ResponseEntity.ok(((java.util.Optional<Employee>) optionalEmployee).get());
        }
        else
            return ResponseEntity.notFound().build();
    }

    // Metodo para generar un nuevo empleado
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee1){
        Employee newemployee = employeeRepository1.save(employee1);

        return ResponseEntity.ok(newemployee);
    }

    // Metodo para eliminar un empleado
    public ResponseEntity<Void> deleteEmployee(@PathVariable("employeeId") Long employeeId){
        employeeRepository1.deleteById(employeeId);

        return ResponseEntity.ok(null);
    }

    // Metodo para editar un empleado
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee1){
        Optional<Employee> optionalemployee = employeeRepository1.findById(employee1.getId());
        if(optionalemployee.isPresent()){
            Employee updateEmployee = optionalemployee.get();
            updateEmployee.setName(employee1.getName());
            updateEmployee.setEmail(employee1.getEmail());
            updateEmployee.setEnterprise(employee1.getEnterprise());
            updateEmployee.setRoleName(employee1.getRoleName());
            employeeRepository1.save(updateEmployee);

            return ResponseEntity.ok(updateEmployee);
        }
        else
            return ResponseEntity.notFound().build();
    }
}
