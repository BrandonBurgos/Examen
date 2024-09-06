package com.ejemplo.Examen.service;

import com.ejemplo.Examen.model.Usuario;
import com.ejemplo.Examen.repository.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usuarioService {

    @Autowired
    private usuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario update(Long id, Usuario usuarioActualizado) {
        
        Usuario usuarioExistente = usuarioRepository.findById(id).orElse(null);
        if (usuarioExistente != null) {
           
            usuarioExistente.setUsuario(usuarioActualizado.getUsuario());
            usuarioExistente.setContrasena(usuarioActualizado.getContrasena());
            usuarioExistente.setEstado(usuarioActualizado.getEstado());
            usuarioExistente.setRol(usuarioActualizado.getRol());
            usuarioExistente.setRoles(usuarioActualizado.getRoles());
            usuarioExistente.setPublicaciones(usuarioActualizado.getPublicaciones());
            
            return usuarioRepository.save(usuarioExistente);
        }
        
        return null;
    }
}
