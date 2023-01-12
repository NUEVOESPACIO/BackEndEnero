package com.sistema.examenes.servicios;
import com.sistema.examenes.entidades.Educacion;
import java.util.List;

public interface EducacionService {
    
    public Educacion guardarEducacion(Educacion educacion) throws Exception;
    
    public void eliminarEducacion(Long educacionid);
    
    public List<Educacion> listadeEducacion();
    
}