package pe.com.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.banco.entity.Card;
import pe.com.banco.service.CardService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardController {

    @Autowired
    private CardService cardService;

    @GetMapping
    public List<Card> findAll(){
        return cardService.findAll();
    }

    @GetMapping("/findBalanceById/{idCard}")
    public BigDecimal findBalanceById(@PathVariable Long idCard){
        return cardService.findBalanceById(idCard);
    }

    @PostMapping
    public Card create(@RequestBody Card card) {
        return cardService.create(card);
    }

}