package pe.com.banco.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.banco.entity.Customer;
import pe.com.banco.repository.CustomerRepository;
import pe.com.banco.service.CustomerService;

@Service
public class CustomerServiceImpl  implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public Customer create(Customer customer) {
		return customerRepository.save(customer);    
	}

	@Override
	public Customer update(Customer customer) {
		return customerRepository.save(customer);
	}

}