package pe.com.banco.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.banco.entity.Account;
import pe.com.banco.entity.Customer;
import pe.com.banco.repository.AccountRepository;
import pe.com.banco.repository.CustomerRepository;
import pe.com.banco.service.AccountService;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Account create(Account account) {
        Customer customerFound = customerRepository.findById(account.getCustomer().getIdCustomer()).get();
        Account objAccount = null;
        if(customerFound!=null){

            if(customerFound.getTypeCustomer().getIdTypeCustomer() == 1){ // cliente es PERSONAL

                List<Account> listAccountsFound = accountRepository.findByProduct_IdProductAndCustomer_IdCustomer(
                                account.getProduct().getIdProduct(), account.getCustomer().getIdCustomer());

                if(listAccountsFound==null || listAccountsFound.isEmpty()){
                    objAccount = accountRepository.save(account);
                } else {
                    //Validación: Un cliente personal solo puede tener un máximo de una cuenta de ahorro, una cuenta corriente o cuentas a plazo fijo.
                }

            } else { //cliente es EMPRESARIAL

                if(account.getProduct().getIdProduct() == 1 || account.getProduct().getIdProduct() == 3){
                    //Un cliente empresarial no puede tener una cuenta de ahorro o de plazo fijo, pero sí múltiples cuentas corrientes.
                } else {
                    objAccount = accountRepository.save(account);
                }

            }
        }

        return objAccount;
    }

    @Override
    public Account findById(Long id) {
        return accountRepository.findById(id).get();
    }

    @Override
    public BigDecimal findBalanceById(Long id) {
        Account account = findById(id);
        return account.getBalance();
    }

}