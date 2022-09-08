package com.GADJET.Sprint_3_4.services;

import com.GADJET.Sprint_3_4.entities.Transaction;
import com.GADJET.Sprint_3_4.repositories.transactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class transactionServices {

    @Autowired
    private transactionRepository transactionsRepository;

    //Constructor de transaction repository
    public transactionServices(transactionRepository transactionsRepository) {
        this.transactionsRepository = transactionsRepository;
    }

    // Metodo para construir todos las transacciones
    public ResponseEntity<List<Transaction>> getTransaction(){
        List<Transaction> transactions = transactionsRepository.findAll();

        return ResponseEntity.ok(transactions);
    }

    // Metodo para listar una transaccion por su identificacion
    public ResponseEntity<Transaction> gettransactionById(@PathVariable("transactionId") Long transactionId){
        java.util.Optional<Transaction> optionalTransaction = transactionsRepository.findById(transactionId);
        if (((java.util.Optional<Transaction>) optionalTransaction).isPresent()){
            return ResponseEntity.ok(((java.util.Optional<Transaction>) optionalTransaction).get());
        }
        else
            return ResponseEntity.notFound().build();
    }

    // Metodo para generar un nueva transaccion
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction){
        Transaction newtransaction = transactionsRepository.save(transaction);

        return ResponseEntity.ok(newtransaction);
    }

    // Metodo para eliminar un transaccion
    public ResponseEntity<Void> deleteTransaction(@PathVariable("transactionId") Long transactionId){
        transactionsRepository.deleteById(transactionId);

        return ResponseEntity.ok(null);}

    // Metodo para editar un transaccion
    public ResponseEntity<Transaction> updateTransaction(@RequestBody Transaction transaction){
        Optional<Transaction> optionaltransaction = transactionsRepository.findById(transaction.getId());
        if(optionaltransaction.isPresent()){
            Transaction updateTransaction = optionaltransaction.get();
            updateTransaction.setAmount(transaction.getAmount());
            updateTransaction.setConcept(transaction.getConcept());
            updateTransaction.setEmployee(transaction.getEmployee());
            updateTransaction.setType(transaction.getType());
            transactionsRepository.save(updateTransaction);

            return ResponseEntity.ok(updateTransaction);
        }
        else
            return ResponseEntity.notFound().build();
    }
}
