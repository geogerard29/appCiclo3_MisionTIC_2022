package com.GADJET.Sprint_3_4.frontServices;

import com.GADJET.Sprint_3_4.entities.Employee;
import com.GADJET.Sprint_3_4.entities.Transaction;
import com.GADJET.Sprint_3_4.repositories.transactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class frontTransactionsServices {
    @Autowired
    private transactionRepository transactionRepository2;

    public List<Transaction> getAllTransactions() {
        return transactionRepository2.findAll();
    }

    public void saveTransaction(Transaction transaction) {
        this.transactionRepository2.save(transaction);
    }

    public Transaction getTransactionById(long id) {
        Optional<Transaction> optional = transactionRepository2.findById(id);
        Transaction transaction = null;
        if (optional.isPresent()) {
            transaction = optional.get();
        } else {
            throw new RuntimeException(" Transaction not found for id :: " + id);
        }
        return transaction;
    }

    public void deleteTransactionById(long id) {
        this.transactionRepository2.deleteById(id);
    }
}