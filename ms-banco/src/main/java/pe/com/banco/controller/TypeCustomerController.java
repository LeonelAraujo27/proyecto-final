package pe.com.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.banco.entity.Customer;
import pe.com.banco.entity.TypeCustomer;
import pe.com.banco.service.CustomerService;
import pe.com.banco.service.TypeCustomerService;

import java.util.List;

@RestController
@RequestMapping("/type-customers")
public class TypeCustomerController {
	
	@Autowired
	private TypeCustomerService typeCustomerService;
	
	@GetMapping
	public List<TypeCustomer> findAll(){
		return typeCustomerService.findAll();
	}

}
