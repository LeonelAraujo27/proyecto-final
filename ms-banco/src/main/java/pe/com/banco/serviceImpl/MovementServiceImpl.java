package pe.com.banco.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.banco.entity.Account;
import pe.com.banco.entity.Movement;
import pe.com.banco.repository.AccountRepository;
import pe.com.banco.repository.MovementRepository;
import pe.com.banco.service.MovementService;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class MovementServiceImpl implements MovementService {

    @Autowired
    private MovementRepository movementRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Movement> findByIdAccount(Long idAccount) {
        return movementRepository.findByAccount_IdAccount(idAccount);
    }

    @Override
    public Movement create(Movement movement) {
        movement.setDateRegistration(LocalDateTime.now());
        movement = movementRepository.save(movement);

        if(movement!=null){
            Account accountFound = accountRepository.findById(movement.getAccount().getIdAccount()).get();
            BigDecimal balance = accountFound.getBalance();
            if(movement.getTypeMovement().getIdTypeMovement()==1){ //Deposito
                balance = balance.add(movement.getAmount());
            } else {
                balance = balance.subtract(movement.getAmount());
            }
            accountFound.setBalance(balance);
            accountRepository.save(accountFound);
        }

        return movement;
    }

}