package pe.com.banco.service;

import pe.com.banco.entity.Card;
import pe.com.banco.entity.Customer;

import java.math.BigDecimal;
import java.util.List;

public interface CardService {

    List<Card> findAll();
    BigDecimal findBalanceById(Long idCard);
    Card create(Card card);
}