package com.ejemplo.Examen.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // toString

    @Override
    public String toString() {
        return "Rol{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    // equals y hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rol rol = (Rol) o;
        return Objects.equals(id, rol.id) &&
                Objects.equals(tipo, rol.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipo);
    }
}

