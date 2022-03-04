package pe.com.banco.service;

import pe.com.banco.entity.Account;

import java.math.BigDecimal;

public interface AccountService {

    Account create(Account account);
    Account findById(Long id);
    BigDecimal findBalanceById(Long id);

}