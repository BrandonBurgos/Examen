package com.ejemplo.Examen.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "publicacion")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_id_persona")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "fk_id_usuario")
    private Usuario autor;

    private String cuerpo;

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    // toString

    @Override
    public String toString() {
        return "Publicacion{" +
                "id=" + id +
                ", persona=" + persona +
                ", autor=" + autor +
                ", cuerpo='" + cuerpo + '\'' +
                '}';
    }

    // equals y hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publicacion that = (Publicacion) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(persona, that.persona) &&
                Objects.equals(autor, that.autor) &&
                Objects.equals(cuerpo, that.cuerpo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, persona, autor, cuerpo);
    }
}
