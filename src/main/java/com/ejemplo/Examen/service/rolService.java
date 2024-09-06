package com.ejemplo.Examen.service;

import com.ejemplo.Examen.model.Rol;
import com.ejemplo.Examen.repository.rolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class rolService {

    @Autowired
    private rolRepository rolRepository;

    public List<Rol> findAll() {
        return rolRepository.findAll();
    }

    public Rol findById(Long id) {
        return rolRepository.findById(id).orElse(null);
    }

    public Rol save(Rol rol) {
        return rolRepository.save(rol);
    }

    public void deleteById(Long id) {
        rolRepository.deleteById(id);
    }

    public Rol update(Long id, Rol rolActualizado) {
       
        Rol rolExistente = rolRepository.findById(id).orElse(null);
        if (rolExistente != null) {
         
            rolExistente.setTipo(rolActualizado.getTipo());
           
            return rolRepository.save(rolExistente);
        }
       
        return null;
    }
}
