package pe.com.banco.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.banco.entity.Customer;
import pe.com.banco.entity.Loan;
import pe.com.banco.repository.CustomerRepository;
import pe.com.banco.repository.LoanRepository;
import pe.com.banco.repository.MovementRepository;
import pe.com.banco.service.LoanService;

import java.util.List;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private LoanRepository loanRepository;

    @Override
    public Loan create(Loan objLoan) {

        Loan loan = null;

        Customer customer =customerRepository.findById(objLoan.getCustomer().getIdCustomer()).get();

        if(customer.getTypeCustomer().getIdTypeCustomer()==1){ //PERSONAL
            List<Loan> listLoan = loanRepository.findByCustomer_IdCustomer(objLoan.getCustomer().getIdCustomer());

            if(listLoan==null || listLoan.isEmpty()){
                loan =loanRepository.save(objLoan);
            }

        }else{
            loan =loanRepository.save(objLoan);
        }

        return loan;
    }

    @Override
    public List<Loan> findAll() {
        return loanRepository.findAll();
    }

}