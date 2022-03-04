package pe.com.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.banco.entity.Card;
import pe.com.banco.entity.Loan;
import pe.com.banco.service.LoanService;

import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping
    public Loan create(@RequestBody Loan loan) {
        return loanService.create(loan);
    }

    @GetMapping
    public List<Loan> findAll(){
        return loanService.findAll();
    }

}