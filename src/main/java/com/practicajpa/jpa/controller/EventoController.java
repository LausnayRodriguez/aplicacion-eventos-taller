package com.practicajpa.jpa.controller;

import com.practicajpa.jpa.model.Evento;
import com.practicajpa.jpa.service.EventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RequiredArgsConstructor
@RestController
@RequestMapping("/evento")
public class EventoController {

    private final EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }
    @PostMapping("/crear")
    public ResponseEntity<Evento> crearEvento(@RequestBody Evento evento) {
        return new ResponseEntity<>(eventoService.crearEvento(evento), HttpStatus.CREATED);
    }
}
