
package com.sistema.examenes.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TipoEmpleo")
public class TipoEmpleo {

    public TipoEmpleo() {
    }

    public TipoEmpleo(Long id, String tipoEmpleo) {
        this.id = id;
        this.tipoEmpleo = tipoEmpleo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoEmpleo() {
        return tipoEmpleo;
    }

    public void setTipoEmpleo(String tipoEmpleo) {
        this.tipoEmpleo = tipoEmpleo;
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id; 
    private String tipoEmpleo;    
    
}
