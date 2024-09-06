package com.ejemplo.Examen.repository;

import com.ejemplo.Examen.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personaRepository extends JpaRepository<Persona, Long> {
}
