package com.GADJET.Sprint_3_4.controllers;

import com.GADJET.Sprint_3_4.entities.Enterprise;
import com.GADJET.Sprint_3_4.services.enterpriseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("enterprise")
public class enterpriseControllers {

    @Autowired
    enterpriseServices ENT1;

    public enterpriseControllers(enterpriseServices ENT1) {
        this.ENT1 = ENT1;
    }

    @GetMapping
    public ResponseEntity<List<Enterprise>> EnterList(){
        return ENT1.getEnterprise();
    }

    @RequestMapping(value = "{enterpriseId}")
    public ResponseEntity<Enterprise> E1(@PathVariable("enterpriseId") Long EnterpriseId){
        return ENT1.getEnterpriseById(EnterpriseId);
    }

    @PostMapping
    public ResponseEntity<Enterprise> E2(@RequestBody Enterprise ent1){
        return ENT1.createEnterprise(ent1);
    }

    @DeleteMapping(value = "{enterpriseId}")
    public ResponseEntity<Void> E3(@PathVariable("enterpriseId") Long enterpriseId){
        return ENT1.deleteEnterprise(enterpriseId);
    }

    @PutMapping
    public ResponseEntity<Enterprise> E4(@RequestBody Enterprise ent1){
        return ENT1.updateEnterprise(ent1);
    }
}
 