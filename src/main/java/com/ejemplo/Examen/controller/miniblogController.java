package com.ejemplo.Examen.controller;

import com.ejemplo.Examen.model.Persona;
import com.ejemplo.Examen.model.Publicacion;
import com.ejemplo.Examen.model.Rol;
import com.ejemplo.Examen.model.Usuario;
import com.ejemplo.Examen.service.personaService;
import com.ejemplo.Examen.service.publicacionService;
import com.ejemplo.Examen.service.rolService;
import com.ejemplo.Examen.service.usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class miniblogController {

    @Autowired
    private rolService rolService;

    @Autowired
    private usuarioService usuarioService;

    @Autowired
    private personaService personaService;

    @Autowired
    private publicacionService publicacionService;

    // Rol

    @GetMapping("/roles")
    public ResponseEntity<List<Rol>> getAllRoles() {
        return ResponseEntity.ok(rolService.findAll());
    }

    @GetMapping("/roles/{id}")
    public ResponseEntity<Rol> getRoleById(@PathVariable Long id) {
        Rol rol = rolService.findById(id);
        return rol != null ? ResponseEntity.ok(rol) : ResponseEntity.notFound().build();
    }

    @PostMapping("/roles")
    public ResponseEntity<Rol> createRole(@RequestBody Rol rol) {
        Rol createdRol = rolService.save(rol);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdRol);
    }

    @PutMapping("/roles/{id}")
    public ResponseEntity<Rol> updateRole(@PathVariable Long id, @RequestBody Rol rol) {
        Rol updatedRol = rolService.update(id, rol);
        return updatedRol != null ? ResponseEntity.ok(updatedRol) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/roles/{id}")
    public ResponseEntity<Void> deleteRole(@PathVariable Long id) {
        rolService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    // Usuario

    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> getAllUsuarios() {
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @GetMapping("/usuarios/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable Long id) {
        Usuario usuario = usuarioService.findById(id);
        return usuario != null ? ResponseEntity.ok(usuario) : ResponseEntity.notFound().build();
    }

    @PostMapping("/usuarios")
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
        Usuario createdUsuario = usuarioService.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUsuario);
    }

    @PutMapping("/usuarios/{id}")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        Usuario updatedUsuario = usuarioService.update(id, usuario);
        return updatedUsuario != null ? ResponseEntity.ok(updatedUsuario) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/usuarios/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        usuarioService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    // Persona

    @GetMapping("/personas")
    public ResponseEntity<List<Persona>> getAllPersonas() {
        return ResponseEntity.ok(personaService.findAll());
    }

    @GetMapping("/personas/{id}")
    public ResponseEntity<Persona> getPersonaById(@PathVariable Long id) {
        Persona persona = personaService.findById(id);
        return persona != null ? ResponseEntity.ok(persona) : ResponseEntity.notFound().build();
    }

    @PostMapping("/personas")
    public ResponseEntity<Persona> createPersona(@RequestBody Persona persona) {
        Persona createdPersona = personaService.save(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPersona);
    }

    @PutMapping("/personas/{id}")
    public ResponseEntity<Persona> updatePersona(@PathVariable Long id, @RequestBody Persona persona) {
        Persona updatedPersona = personaService.update(id, persona);
        return updatedPersona != null ? ResponseEntity.ok(updatedPersona) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/personas/{id}")
    public ResponseEntity<Void> deletePersona(@PathVariable Long id) {
        personaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    // Publicacion

    @GetMapping("/publicaciones")
    public ResponseEntity<List<Publicacion>> getAllPublicaciones() {
        return ResponseEntity.ok(publicacionService.findAll());
    }

    @GetMapping("/publicaciones/{id}")
    public ResponseEntity<Publicacion> getPublicacionById(@PathVariable Long id) {
        Publicacion publicacion = publicacionService.findById(id);
        return publicacion != null ? ResponseEntity.ok(publicacion) : ResponseEntity.notFound().build();
    }

    @PostMapping("/publicaciones")
    public ResponseEntity<Publicacion> createPublicacion(@RequestBody Publicacion publicacion) {
        Publicacion createdPublicacion = publicacionService.save(publicacion);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPublicacion);
    }


    @DeleteMapping("/publicaciones/{id}")
    public ResponseEntity<Void> deletePublicacion(@PathVariable Long id) {
        publicacionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

