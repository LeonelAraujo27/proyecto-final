package pe.com.banco.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import pe.com.banco.entity.Movement;

import java.util.List;

public interface MovementService {

    List<Movement> findByIdAccount(@PathVariable Long idAccount);
    Movement create(@RequestBody Movement movement);

}