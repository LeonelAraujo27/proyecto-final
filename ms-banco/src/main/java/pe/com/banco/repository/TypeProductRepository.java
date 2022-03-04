package pe.com.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.banco.entity.TypeProduct;

@Repository
public interface TypeProductRepository extends JpaRepository<TypeProduct, Long> {
}
