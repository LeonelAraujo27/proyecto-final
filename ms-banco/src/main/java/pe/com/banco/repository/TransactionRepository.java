package pe.com.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.banco.entity.Transaction;

import java.math.BigDecimal;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    @Query("Select sum(t.amount) from Transaction t where t.card.idCard = :idCard " +
            "and t.typeTransaction.idTypeTransaction = :idTypeTransaction")
    BigDecimal findByCard_IdCardAndTypeTransaction(Long idCard, Long idTypeTransaction);

}
