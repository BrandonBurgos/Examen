package com.ejemplo.Examen.service;

import com.ejemplo.Examen.model.Persona;
import com.ejemplo.Examen.repository.personaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class personaService {

    @Autowired
    private personaRepository personaRepository;

    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    public Persona findById(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    public void deleteById(Long id) {
        personaRepository.deleteById(id);
    }

    public Persona update(Long id, Persona personaActualizada) {

        Persona personaExistente = personaRepository.findById(id).orElse(null);
        if (personaExistente != null) {

            personaExistente.setNombres(personaActualizada.getNombres());
            personaExistente.setApellidos(personaActualizada.getApellidos());
            personaExistente.setSexo(personaActualizada.getSexo());
            personaExistente.setPais(personaActualizada.getPais());
            personaExistente.setDireccion(personaActualizada.getDireccion());

            return personaRepository.save(personaExistente);
        }

        return null;
    }
}

