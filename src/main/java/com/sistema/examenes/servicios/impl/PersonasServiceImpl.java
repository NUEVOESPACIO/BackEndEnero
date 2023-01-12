package com.sistema.examenes.servicios.impl;

import com.sistema.examenes.entidades.Personas;
import com.sistema.examenes.repositorios.PersonasRepository;

import com.sistema.examenes.servicios.PersonasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonasServiceImpl implements PersonasService{
    
    @Autowired
    private PersonasRepository  personasRepository;   

    @Override
    public Personas guardarPersona(Personas personas) throws Exception {
        
        return personasRepository.save(personas);
       
    }

    @Override
    public void eliminarPersona(Long personaid) {
        
        personasRepository.deleteById(personaid);
       
    }

    @Override
    public List<Personas> listadePersonas() {
        
        return personasRepository.findAll();
       
    }
    
    
    
}
