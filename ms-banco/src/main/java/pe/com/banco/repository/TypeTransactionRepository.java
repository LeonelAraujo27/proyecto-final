package pe.com.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.banco.entity.TypeTransaction;

@Repository
public interface TypeTransactionRepository extends JpaRepository<TypeTransaction, Long> {
}
