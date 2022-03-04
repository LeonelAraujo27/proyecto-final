package pe.com.banco.service;

import pe.com.banco.entity.Transaction;

public interface TransactionService {

    Transaction create(Transaction transaction, Long idService);

}