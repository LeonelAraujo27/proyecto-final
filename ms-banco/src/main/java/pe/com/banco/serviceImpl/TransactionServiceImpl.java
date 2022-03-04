package pe.com.banco.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.banco.entity.Transaction;
import pe.com.banco.entity.TransactionConsumption;
import pe.com.banco.repository.ServiceRepository;
import pe.com.banco.repository.TransactionConsumptionRepository;
import pe.com.banco.repository.TransactionRepository;
import pe.com.banco.service.TransactionService;

import java.time.LocalDateTime;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    public TransactionRepository transactionRepository;

    @Autowired
    public TransactionConsumptionRepository transactionConsumptionRepository;

    @Autowired
    public ServiceRepository serviceRepository;

    @Override
    public Transaction create(Transaction objTransaction, Long idService) {
        objTransaction.setDateRegistration(LocalDateTime.now());
        Transaction transaction = transactionRepository.save(objTransaction);

        if(transaction.getTypeTransaction().getIdTypeTransaction()==1){ //Consumo
            TransactionConsumption transactionConsumption = new TransactionConsumption();
            transactionConsumption.setTransaction(transaction);
            transactionConsumption.setService(serviceRepository.findById(idService).get());
            transactionConsumptionRepository.save(transactionConsumption);
        }

        return transaction;
    }

}