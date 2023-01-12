
package com.sistema.examenes.servicios;

import com.sistema.examenes.entidades.Proyectos;
import java.util.List;

public interface ProyectosService {
    
    public Proyectos guardarProyectos(Proyectos proyectos) throws Exception;
    
    public void eliminarProyectos(Long proyectosid);
    
    public List<Proyectos> listadeProyectos();
    
}
