package pe.com.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.banco.entity.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

}