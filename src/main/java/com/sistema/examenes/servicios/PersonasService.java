
package com.sistema.examenes.servicios;
import com.sistema.examenes.entidades.Personas;
import java.util.List;


public interface PersonasService {
    
    public Personas guardarPersona(Personas personas) throws Exception;
    
    public void eliminarPersona(Long personasid);
    
    public List<Personas> listadePersonas();
    
}
