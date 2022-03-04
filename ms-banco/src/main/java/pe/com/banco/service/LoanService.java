package pe.com.banco.service;

import org.springframework.web.bind.annotation.RequestBody;
import pe.com.banco.entity.Loan;
import java.util.List;

public interface LoanService {

    Loan create(@RequestBody Loan loan);
    List<Loan> findAll();

}