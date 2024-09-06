package com.ejemplo.Examen.model;

import jakarta.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String usuario;
    private String contrasena;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "fk_id_rol")
    private Rol rol;

    @ManyToMany
    @JoinTable(
        name = "usuarioRol",
        joinColumns = @JoinColumn(name = "fk_id_usuario"),
        inverseJoinColumns = @JoinColumn(name = "fk_id_rol")
    )
    private Set<Rol> roles;

    @OneToMany(mappedBy = "autor")
    private Set<Publicacion> publicaciones;

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }

    public Set<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(Set<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    // toString

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", estado='" + estado + '\'' +
                ", rol=" + rol +
                ", roles=" + roles +
                ", publicaciones=" + publicaciones +
                '}';
    }

    // equals y hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario1 = (Usuario) o;
        return Objects.equals(id, usuario1.id) &&
                Objects.equals(usuario, usuario1.usuario) &&
                Objects.equals(contrasena, usuario1.contrasena) &&
                Objects.equals(estado, usuario1.estado) &&
                Objects.equals(rol, usuario1.rol) &&
                Objects.equals(roles, usuario1.roles) &&
                Objects.equals(publicaciones, usuario1.publicaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, usuario, contrasena, estado, rol, roles, publicaciones);
    }
}

