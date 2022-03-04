package pe.com.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.banco.entity.Account;
import pe.com.banco.entity.Movement;
import pe.com.banco.service.MovementService;

import java.util.List;

@RestController
@RequestMapping("/movements")
public class MovementController {

    @Autowired
    private MovementService movementService;

    @GetMapping("/findByIdAccount/{idAccount}")
    public List<Movement> findByIdAccount(@PathVariable Long idAccount){
        return movementService.findByIdAccount(idAccount);
    }

    @PostMapping
    public Movement create(@RequestBody Movement movement) {
        return movementService.create(movement);
    }

}