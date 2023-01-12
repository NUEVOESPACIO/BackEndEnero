
package com.sistema.examenes.entidades;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Experiencial")
public class Experiencial {

    public Experiencial() {
    }

    public Experiencial(Long id, String nombreEmpresa, boolean esTrabajoActual, String fechaini, String fechafin, String descripcion, Long persona, Long tipoempleo) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.esTrabajoActual = esTrabajoActual;
        this.fechaini = fechaini;
        this.fechafin = fechafin;
        this.descripcion = descripcion;
        this.persona = persona;
        this.tipoempleo = tipoempleo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public boolean isEsTrabajoActual() {
        return esTrabajoActual;
    }

    public void setEsTrabajoActual(boolean esTrabajoActual) {
        this.esTrabajoActual = esTrabajoActual;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getPersona() {
        return persona;
    }

    public void setPersona(Long persona) {
        this.persona = persona;
    }

    public Long getTipoempleo() {
        return tipoempleo;
    }

    public void setTipoempleo(Long tipoempleo) {
        this.tipoempleo = tipoempleo;
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id; 
    private String nombreEmpresa;
    private boolean esTrabajoActual;    
    private String fechaini;    
    private String fechafin;
    private String descripcion;
    private Long persona;
    private Long tipoempleo;
    
    
}
