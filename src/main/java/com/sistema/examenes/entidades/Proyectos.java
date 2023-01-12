
package com.sistema.examenes.entidades;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Proyectos")
public class Proyectos{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getEntorno() {
        return entorno;
    }

    public void setEntorno(String entorno) {
        this.entorno = entorno;
    }

    public String getMarco() {
        return marco;
    }

    public void setMarco(String marco) {
        this.marco = marco;
    }

    public String getAprendisajeObtenido() {
        return aprendisajeObtenido;
    }

    public void setAprendisajeObtenido(String aprendisajeObtenido) {
        this.aprendisajeObtenido = aprendisajeObtenido;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Long getPersona() {
        return persona;
    }

    public void setPersona(Long persona) {
        this.persona = persona;
    }

    public Proyectos() {
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }


    private String nombreProyecto;
    private String entorno;    
    private String marco;
    private String aprendisajeObtenido;
    private String fechaini;    
    private String fechafin;
    private String link;
    private String imagen;
    private Long persona;  
    private String funcion;
    private String resultado;
    private boolean esProyectoActual;  

    public Proyectos(Long id, String nombreProyecto, String entorno, String marco, String aprendisajeObtenido, String fechaini, String fechafin, String link, String imagen, Long persona, String funcion, String resultado, boolean esProyectoActual) {
        this.id = id;
        this.nombreProyecto = nombreProyecto;
        this.entorno = entorno;
        this.marco = marco;
        this.aprendisajeObtenido = aprendisajeObtenido;
        this.fechaini = fechaini;
        this.fechafin = fechafin;
        this.link = link;
        this.imagen = imagen;
        this.persona = persona;
        this.funcion = funcion;
        this.resultado = resultado;
        this.esProyectoActual = esProyectoActual;
    }



    public boolean isEsProyectoActual() {
        return esProyectoActual;
    }

    public void setEsProyectoActual(boolean esProyectoActual) {
        this.esProyectoActual = esProyectoActual;
    }

    
}