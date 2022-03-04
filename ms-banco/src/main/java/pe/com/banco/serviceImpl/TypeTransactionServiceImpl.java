package pe.com.banco.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.banco.entity.TypeTransaction;
import pe.com.banco.repository.TypeTransactionRepository;
import pe.com.banco.service.TypeTransactionService;

import java.util.List;

@Service
public class TypeTransactionServiceImpl implements TypeTransactionService {


    @Autowired
    public TypeTransactionRepository typeTransactionRepository;

    @Override
    public List<TypeTransaction> findAll() {
        return typeTransactionRepository.findAll();
    }
}
