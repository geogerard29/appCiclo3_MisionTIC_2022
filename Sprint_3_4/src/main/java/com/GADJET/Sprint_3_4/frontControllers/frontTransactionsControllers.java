package com.GADJET.Sprint_3_4.frontControllers;

import com.GADJET.Sprint_3_4.entities.Employee;
import com.GADJET.Sprint_3_4.entities.Transaction;
import com.GADJET.Sprint_3_4.frontServices.frontTransactionsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class frontTransactionsControllers {
    @Autowired
    frontTransactionsServices TS2;

    public frontTransactionsControllers(frontTransactionsServices TS2) {
        this.TS2 = TS2;
    }

    @GetMapping("/transactions")
    public String transactions(Model model){
        model.addAttribute("listtransactions", TS2.getAllTransactions());
        return "List_of_Transactions";
    }

    @GetMapping("/newTransaction")
    public String newTransaction(Model model) {
        // create model attribute to bind form data
        Transaction transaction = new Transaction();
        model.addAttribute("transaction", transaction);
        return "New_Transaction";
    }

    @PostMapping("/saveTransaction")
    public String saveTransaction(@ModelAttribute("transaction") Transaction transaction) {
        // save transaction to database
        TS2.saveTransaction(transaction);
        return "redirect:/transactions";
    }
    @GetMapping("/updatingTransaction/{id}")
    public String updatingTransaction(@PathVariable( value = "id") long id, Model model) {
        // get transaction from the service
        Transaction transaction = TS2.getTransactionById(id);
        // set transaction as a model attribute to pre-populate the form
        model.addAttribute("transaction", transaction);
        return "Updating_Transaction";
    }
    @GetMapping("/deleteTransaction/{id}")
    public String deleteTransaction(@PathVariable(value = "id") long id) {
        // call delete transaction method
        this.TS2.deleteTransactionById(id);
        return "redirect:/transactions";
    }
}
