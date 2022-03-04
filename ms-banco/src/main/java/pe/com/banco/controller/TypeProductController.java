package pe.com.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.banco.entity.TypeCustomer;
import pe.com.banco.entity.TypeProduct;
import pe.com.banco.service.TypeCustomerService;
import pe.com.banco.service.TypeProductService;

import java.util.List;

@RestController
@RequestMapping("/type-products")
public class TypeProductController {

    @Autowired
    private TypeProductService typeProductService;

    @GetMapping
    public List<TypeProduct> findAll(){
        return typeProductService.findAll();
    }

}