
package com.sistema.examenes.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Personas")
public class Personas{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id; 
  
    private String nombre;
    private String apellido;    
    private String domicilio;    
    private String fechanac;        
    private String telefono;
    private String email;
    private String sobremi;  
    private String urlfoto;
    private String slogan;
    private String titulo;
    private String inforesumida; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSobremi() {
        return sobremi;
    }

    public void setSobremi(String sobremi) {
        this.sobremi = sobremi;
    }

    public String getUrlfoto() {
        return urlfoto;
    }

    public void setUrlfoto(String urlfoto) {
        this.urlfoto = urlfoto;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInforesumida() {
        return inforesumida;
    }

    public void setInforesumida(String inforesumida) {
        this.inforesumida = inforesumida;
    }

    public Personas(Long id, String nombre, String apellido, String domicilio, String fechanac, String telefono, String email, String sobremi, String urlfoto, String slogan, String titulo, String inforesumida) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fechanac = fechanac;
        this.telefono = telefono;
        this.email = email;
        this.sobremi = sobremi;
        this.urlfoto = urlfoto;
        this.slogan = slogan;
        this.titulo = titulo;
        this.inforesumida = inforesumida;
    }

    public Personas() {
    }



}
