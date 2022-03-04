package pe.com.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.banco.entity.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {
}
