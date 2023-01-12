
package com.sistema.examenes.servicios.impl;

import com.sistema.examenes.entidades.Experiencial;
import com.sistema.examenes.repositorios.ExperiencialRepository;
import com.sistema.examenes.servicios.ExperiencialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExperiencialServiceImpl implements ExperiencialService {
    
    @Autowired
    private ExperiencialRepository  experiencialRepository;   

    @Override
    public Experiencial guardarExperiencial(Experiencial experiencial) throws Exception {
        
        return experiencialRepository.save(experiencial);
       
    }

    @Override
    public void eliminarExperiencial(Long experiencialid) {
        
        experiencialRepository.deleteById(experiencialid);
       
    }

    @Override
    public List<Experiencial> listadeExperiencial() {
        
        return experiencialRepository.findAll();
       
    }
    
}
