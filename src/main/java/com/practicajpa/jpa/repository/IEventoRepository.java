package com.practicajpa.jpa.repository;

import com.practicajpa.jpa.model.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface IEventoRepository extends CrudRepository<Evento, Long> {

}
