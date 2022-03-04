package pe.com.banco.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.banco.entity.Card;
import pe.com.banco.entity.Transaction;
import pe.com.banco.repository.CardRepository;
import pe.com.banco.repository.CustomerRepository;
import pe.com.banco.repository.TransactionRepository;
import pe.com.banco.service.CardService;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private TransactionRepository transactionRepository;


    @Override
    public List<Card> findAll() {
        return cardRepository.findAll();
    }

    @Override
    public BigDecimal findBalanceById(Long idCard) {
        Card cardFound = cardRepository.findById(idCard).get();

        BigDecimal balance = null;

        if(cardFound!=null){
            BigDecimal limitCard = cardFound.getLimit();
            BigDecimal transactionDeposito = transactionRepository.findByCard_IdCardAndTypeTransaction(idCard, new Long(1));
            BigDecimal transactionRetiro = transactionRepository.findByCard_IdCardAndTypeTransaction(idCard, new Long(2));

            transactionDeposito = transactionDeposito != null ? transactionDeposito : BigDecimal.ZERO;
            transactionRetiro = transactionRetiro != null ? transactionRetiro : BigDecimal.ZERO;

            balance = limitCard.add(transactionDeposito).subtract(transactionRetiro);

        }

        return balance;
    }

    @Override
    public Card create(Card card) {
        return cardRepository.save(card);
    }

}