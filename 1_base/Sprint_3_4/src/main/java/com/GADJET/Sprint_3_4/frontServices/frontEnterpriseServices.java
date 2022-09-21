package com.GADJET.Sprint_3_4.frontServices;

import com.GADJET.Sprint_3_4.entities.Enterprise;
import com.GADJET.Sprint_3_4.repositories.enterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class frontEnterpriseServices {

    @Autowired
    private enterpriseRepository enterpriseRepository2;
    public List<Enterprise> getAllEnterprises() {
        return enterpriseRepository2.findAll();
    }

    public void saveEnterprise(Enterprise enterprise) {
        this.enterpriseRepository2.save(enterprise);
    }

    public Enterprise getEnterpriseById(long id) {
        Optional<Enterprise> optional = enterpriseRepository2.findById(id);
        Enterprise enterprise = null;
        if (optional.isPresent()) {
            enterprise = optional.get();
        } else {
            throw new RuntimeException(" Enterprise not found for id :: " + id);
        }
        return enterprise;
    }

    public void deleteEnterpriseById(long id) {
        this.enterpriseRepository2.deleteById(id);
    }
}
