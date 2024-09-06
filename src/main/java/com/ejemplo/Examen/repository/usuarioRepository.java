package com.ejemplo.Examen.repository;

import com.ejemplo.Examen.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usuarioRepository extends JpaRepository<Usuario, Long> {
}