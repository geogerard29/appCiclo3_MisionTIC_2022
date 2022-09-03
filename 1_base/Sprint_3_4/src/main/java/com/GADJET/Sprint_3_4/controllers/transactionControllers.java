package com.GADJET.Sprint_3_4.controllers;

import com.GADJET.Sprint_3_4.entities.Transaction;
import com.GADJET.Sprint_3_4.repositories.transactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("transactions")
public class transactionControllers {

    @Autowired
    private transactionRepository transactionsRepository;
    @GetMapping()
    // Metodo para construir todos las transacciones
    public ResponseEntity<List<Transaction>> getTransaction(){
        List<Transaction> transactions = transactionsRepository.findAll();

        return ResponseEntity.ok(transactions);
    }

    // Metodo para listar una transaccion por su identificacion
    /*@RequestMapping(value = "{productId}")
    public ResponseEntity<Transaction> getTransactionById(@PathVariable("TransactionId") Long TransactionId){
        java.util.Optional<Transaction> optionalTransaction = transaction.findById(TransactionId);
        if (((java.util.Optional<Transaction>) optionalTransaction).isPresent()) {
            return ResponseEntity.ok(((java.util.Optional<Transaction>) optionalTransaction).get());
        }
        else
            return ResponseEntity.notFound().build();
    }*/

    // Metodo para generar un nueva transaccion
    /*@PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transactionn){
        Transaction newtransactionn = transaction.save(transactionn);
        return ResponseEntity.ok(newtransactionn);
    }*/
}
