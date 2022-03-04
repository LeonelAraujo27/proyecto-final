package pe.com.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.banco.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
