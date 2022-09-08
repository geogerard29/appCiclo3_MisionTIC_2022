package com.GADJET.Sprint_3_4.services;

import com.GADJET.Sprint_3_4.entities.Employee;
import com.GADJET.Sprint_3_4.entities.Enterprise;
import com.GADJET.Sprint_3_4.entities.Transaction;
import com.GADJET.Sprint_3_4.repositories.enterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class enterpriseServices {

    @Autowired
    private enterpriseRepository enterpriseRepository1;

    //Metodo para construir todos las empresas
    public ResponseEntity<List<Enterprise>> getEnterprise() {
        List<Enterprise> enterprises = enterpriseRepository1.findAll();

        return ResponseEntity.ok(enterprises);
    }

    // Metodo para listar una empresa por su identificacion
    public ResponseEntity<Enterprise> getEnterpriseById(@PathVariable("EnterpriseId") Long EnterpriseId) {
        java.util.Optional<Enterprise> optionalEnterprise = enterpriseRepository1.findById(EnterpriseId);
        if (((java.util.Optional<Enterprise>) optionalEnterprise).isPresent()) {
            return ResponseEntity.ok(((java.util.Optional<Enterprise>) optionalEnterprise).get());
        } else
            return ResponseEntity.notFound().build();
         }

        // Metodo para generar una nueva empresa
        public ResponseEntity<Enterprise> createEnterprise(@RequestBody Enterprise enterprise1){
            Enterprise newenterprise = enterpriseRepository1.save(enterprise1);

            return ResponseEntity.ok(newenterprise);
        }

        // Metodo para eliminar una empresa
        public ResponseEntity<Void> deleteEnterprise(@PathVariable("enterpriseId") Long enterpriseId){
            enterpriseRepository1.deleteById(enterpriseId);

            return ResponseEntity.ok(null);
        }

        // Metodo para editar un empleado
        public ResponseEntity<Enterprise> updateEnterprise(@RequestBody Enterprise enterprise1){
            Optional<Enterprise> optionalenterprise = enterpriseRepository1.findById(enterprise1.getId());
            if(optionalenterprise.isPresent()){
                Enterprise updateEnterprise = optionalenterprise.get();
                updateEnterprise.setName(enterprise1.getName());
                updateEnterprise.setNit(enterprise1.getNit());
                updateEnterprise.setPhone(enterprise1.getPhone());
                updateEnterprise.setAddress(enterprise1.getAddress());
                updateEnterprise.setCity(enterprise1.getCity());
                enterpriseRepository1.save(updateEnterprise);

                return ResponseEntity.ok(updateEnterprise);
            }
            else
                return ResponseEntity.notFound().build();
        }
    }
