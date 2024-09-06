package com.ejemplo.Examen.repository;

import com.ejemplo.Examen.model.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface publicacionRepository extends JpaRepository<Publicacion, Long> {
    
}
