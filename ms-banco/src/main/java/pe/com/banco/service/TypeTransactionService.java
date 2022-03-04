package pe.com.banco.service;

import pe.com.banco.entity.TypeTransaction;

import java.util.List;

public interface TypeTransactionService {

    List<TypeTransaction> findAll();

}