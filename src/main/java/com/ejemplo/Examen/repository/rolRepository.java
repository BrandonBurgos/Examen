package com.ejemplo.Examen.repository;


import com.ejemplo.Examen.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface rolRepository extends JpaRepository<Rol, Long> {
 
}
