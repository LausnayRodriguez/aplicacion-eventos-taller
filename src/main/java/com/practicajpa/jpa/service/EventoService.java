package com.practicajpa.jpa.service;

import com.practicajpa.jpa.model.Evento;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoService {

    Evento crearEvento(Evento evento);
}
