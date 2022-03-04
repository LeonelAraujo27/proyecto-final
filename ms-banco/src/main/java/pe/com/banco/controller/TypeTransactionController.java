package pe.com.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.banco.entity.TypeProduct;
import pe.com.banco.entity.TypeTransaction;
import pe.com.banco.service.TypeTransactionService;

import java.util.List;

@RestController
@RequestMapping("/type-transactions")
public class TypeTransactionController {

    @Autowired
    private TypeTransactionService typeTransactionService;

    @GetMapping
    public List<TypeTransaction> findAll(){
        return typeTransactionService.findAll();
    }

}