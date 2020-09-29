package com.we_smorgasbord.potluck_api.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;

import javax.validation.Valid;

import com.we_smorgasbord.potluck_api.models.PotluckEvent;
import com.we_smorgasbord.potluck_api.repository.PotluckEventRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PotluckController {
    private PotluckEventRepository potluckEventRepository;

    public PotluckController(PotluckEventRepository potluckEventRepository) {
        super();
        this.potluckEventRepository = potluckEventRepository;
    }

    @GetMapping("/potluck") 
    Collection<PotluckEvent> potlucks() {
        return potluckEventRepository.findAll();
    }

    @GetMapping("/potluck/{id}")
    ResponseEntity<?> getCategory(@PathVariable long id) {
        Optional<PotluckEvent> potluckEvent = potluckEventRepository.findById(id);
        return potluckEvent.map(response -> ResponseEntity.ok().body(response))
        .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/potluck")
    ResponseEntity<PotluckEvent> createPotluckEvent(@Valid @RequestBody PotluckEvent potluckEvent) throws URISyntaxException {
        PotluckEvent newPotluckEvent = potluckEventRepository.save(potluckEvent);
        return ResponseEntity.created(new URI("/api/potluck" + newPotluckEvent.getId())).body(newPotluckEvent);
    }

}
