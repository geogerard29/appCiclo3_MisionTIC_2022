package com.GADJET.Sprint_3_4.controllers;

import com.GADJET.Sprint_3_4.entities.Enterprise;
import com.GADJET.Sprint_3_4.entities.Transaction;
import com.GADJET.Sprint_3_4.repositories.enterpriseRepository;
import com.GADJET.Sprint_3_4.repositories.transactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("enterprises")
public class enterpriseControllers {

    @Autowired
    private enterpriseRepository enterpriseRepository;
    @GetMapping()
    //Metodo para construir todos las empresas
    public ResponseEntity<List<Enterprise>> getEnterprise(){
    List<Enterprise> enterprises = enterpriseRepository.findAll();

    return ResponseEntity.ok(enterprises);

    }
// Metodo para listar una empresa por su identificacion
    @RequestMapping(value = "{EnterpriseId}")
    public ResponseEntity<Enterprise> getEnterpriseById(@PathVariable("EnterpriseId") Long EnterpriseId){
        java.util.Optional<Enterprise> optionalEnterprise = enterpriseRepository.findById(EnterpriseId);
        if (((java.util.Optional<Enterprise>) optionalEnterprise).isPresent()) {
            return ResponseEntity.ok(((java.util.Optional<Enterprise>) optionalEnterprise).get());
        }
        else
            return ResponseEntity.notFound().build();
    }
}
