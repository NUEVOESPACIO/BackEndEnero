
package com.sistema.examenes.servicios.impl;

import com.sistema.examenes.entidades.Proyectos;
import com.sistema.examenes.repositorios.ProyectosRepository;
import com.sistema.examenes.servicios.ProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProyectosServiceImpl implements ProyectosService {
    
    @Autowired
    private ProyectosRepository  proyectosRepository;   

    @Override
    public Proyectos guardarProyectos(Proyectos proyectos) throws Exception {
        
        return proyectosRepository.save(proyectos);
       
    }

    @Override
    public void eliminarProyectos(Long proyectosid) {
        
        proyectosRepository.deleteById(proyectosid);
       
    }

    @Override
    public List<Proyectos> listadeProyectos() {
        
        return proyectosRepository.findAll();
       
    }
    
}
