package com.sistema.examenes.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Educacion")
public class Educacion {
   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id; 
    private String institucion;
    private String titulo_obtenido;
    private String fechaini;
    private String fechafin;
    private boolean finalizado;
    private String ubicacion;
    private String comentario;
    private Long pertenecea;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getTitulo_obtenido() {
        return titulo_obtenido;
    }

    public void setTitulo_obtenido(String titulo_obtenido) {
        this.titulo_obtenido = titulo_obtenido;
    }

    public String getFechaini() {
        return fechaini;
    }

    public void setFechaini(String fechaini) {
        this.fechaini = fechaini;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Long getPertenecea() {
        return pertenecea;
    }

    public void setPertenecea(Long pertenecea) {
        this.pertenecea = pertenecea;
    }

    public Educacion(Long id, String institucion, String titulo_obtenido, String fechaini, String fechafin, boolean finalizado, String ubicacion, String comentario, Long pertenecea) {
        this.id = id;
        this.institucion = institucion;
        this.titulo_obtenido = titulo_obtenido;
        this.fechaini = fechaini;
        this.fechafin = fechafin;
        this.finalizado = finalizado;
        this.ubicacion = ubicacion;
        this.comentario = comentario;
        this.pertenecea = pertenecea;
    }

    public Educacion() {
    }
 }