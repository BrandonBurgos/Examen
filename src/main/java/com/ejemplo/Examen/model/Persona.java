package com.ejemplo.Examen.model;

import jakarta.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombres;
    private String apellidos;
    private String sexo;
    private String pais;
    private String direccion;

    @OneToMany(mappedBy = "persona")
    private Set<Publicacion> publicaciones;

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
        return "Persona{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", sexo='" + sexo + '\'' +
                ", pais='" + pais + '\'' +
                ", direccion='" + direccion + '\'' +
                ", publicaciones=" + publicaciones +
                '}';
    }

    // equals y hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(id, persona.id) &&
                Objects.equals(nombres, persona.nombres) &&
                Objects.equals(apellidos, persona.apellidos) &&
                Objects.equals(sexo, persona.sexo) &&
                Objects.equals(pais, persona.pais) &&
                Objects.equals(direccion, persona.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombres, apellidos, sexo, pais, direccion);
    }
}


