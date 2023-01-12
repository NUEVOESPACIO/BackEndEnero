
package com.sistema.examenes.servicios.impl;
import com.sistema.examenes.entidades.Educacion;
import com.sistema.examenes.repositorios.EducacionRepository;
import com.sistema.examenes.servicios.EducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionServiceImpl implements EducacionService {
    
    @Autowired
    private EducacionRepository  educacionRepository;    

    @Override
    public Educacion guardarEducacion(Educacion educacion) throws Exception {        
        return educacionRepository.save(educacion);    
    }

    @Override
    public void eliminarEducacion(Long educacionid) {
        
        educacionRepository.deleteById(educacionid);       
        
    }
    
    @Override
    public List<Educacion> listadeEducacion() {                      
        
        return educacionRepository.findAll();
        
        
    }
    
    
    
    }    
    
    
    