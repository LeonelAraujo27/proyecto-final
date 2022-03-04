package pe.com.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.banco.entity.TypeCustomer;

@Repository
public interface TypeCustomerRepository extends JpaRepository<TypeCustomer, Long> {

}