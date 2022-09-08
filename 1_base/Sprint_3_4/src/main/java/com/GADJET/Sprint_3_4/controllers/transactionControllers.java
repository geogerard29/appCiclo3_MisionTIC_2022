package com.GADJET.Sprint_3_4.controllers;

import com.GADJET.Sprint_3_4.entities.Transaction;
import com.GADJET.Sprint_3_4.services.transactionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("transaction")

public class transactionControllers {

    @Autowired
    transactionServices TS1;
    public transactionControllers(transactionServices TS1) {
        this.TS1 = TS1;
    }

    @GetMapping
    public ResponseEntity<List<Transaction>> TranList(){
        return TS1.getTransaction();
    }

    @RequestMapping(value = "{transactionId}")
    public ResponseEntity<Transaction> tran1(@PathVariable("transactionId") Long TransactionId){
        return TS1.gettransactionById(TransactionId); //Ojo posible cambio
    }

    @PostMapping
    public ResponseEntity<Transaction> tran2(@RequestBody Transaction tran){
        return TS1.createTransaction(tran);
    }

    @DeleteMapping(value = "{transactionId}")
    public ResponseEntity<Void> tran3(@PathVariable("transactionId") Long transactionId){
        return TS1.deleteTransaction(transactionId);
    }

    @PutMapping
    public ResponseEntity<Transaction> tran4(@RequestBody Transaction transaction){
        return TS1.updateTransaction(transaction);
    }
}
