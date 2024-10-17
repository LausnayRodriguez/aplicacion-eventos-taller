package com.practicajpa.jpa.service;

import com.practicajpa.jpa.model.Evento;
import com.practicajpa.jpa.repository.IEventoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

//@RequiredArgsConstructor
@Service
public class EventoRepositoryImpl implements EventoService {

    private final IEventoRepository eventoRepository;

    public EventoRepositoryImpl(IEventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }
    @Override
    public Evento crearEvento(Evento evento) {
        return eventoRepository.save(evento);
    }
}
