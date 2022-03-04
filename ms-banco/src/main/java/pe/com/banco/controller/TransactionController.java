package pe.com.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.banco.entity.Transaction;
import pe.com.banco.service.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public Transaction create(@RequestBody Transaction transaction,
        @RequestParam(required = false) Long idService) {
        return transactionService.create(transaction, idService);
    }

}