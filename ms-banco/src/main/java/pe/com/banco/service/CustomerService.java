package pe.com.banco.service;

import java.util.List;
import pe.com.banco.entity.Customer;

public interface CustomerService {
	
	List<Customer> findAll();
	Customer create(Customer customer);
	Customer update(Customer customer);

}
