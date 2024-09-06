package com.ejemplo.Examen.service;

import com.ejemplo.Examen.model.Publicacion;
import com.ejemplo.Examen.repository.publicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class publicacionService {

    @Autowired
    private publicacionRepository publicacionRepository;

    public List<Publicacion> findAll() {
        return publicacionRepository.findAll();
    }

    public Publicacion findById(Long id) {
        return publicacionRepository.findById(id).orElse(null);
    }

    public Publicacion save(Publicacion publicacion) {
        return publicacionRepository.save(publicacion);
    }

    public void deleteById(Long id) {
        publicacionRepository.deleteById(id);
    }

}
