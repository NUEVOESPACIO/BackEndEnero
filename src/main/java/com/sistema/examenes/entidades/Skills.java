
package com.sistema.examenes.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Skills")
public class Skills {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public String getNombreskill() {
        return nombreskill;
    }

    public void setNombreskill(String nombreskill) {
        this.nombreskill = nombreskill;
    }

    public String getTipohs() {
        return tipohs;
    }

    public void setTipohs(String tipohs) {
        this.tipohs = tipohs;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getValmax() {
        return valmax;
    }

    public void setValmax(Long valmax) {
        this.valmax = valmax;
    }

    public Long getValue() {
        return valor;
    }

    public void setValue(Long valor) {
        this.valor = valor;
    }

    public Long getPersona() {
        return persona;
    }

    public void setPersona(Long persona) {
        this.persona = persona;
    }

    public Skills(Long id, String nombreskill, String tipohs, String descripcion, Long valmax, Long valor, Long persona) {
        this.id = id;
        this.nombreskill = nombreskill;
        this.tipohs = tipohs;
        this.descripcion = descripcion;
        this.valmax = valmax;
        this.valor = valor;
        this.persona = persona;
    }

    public Skills() {
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;   
    private String nombreskill;
    private String tipohs;  
    private String descripcion;    
    private Long valmax ;    
    private Long valor; 
    private Long persona;
    
}
