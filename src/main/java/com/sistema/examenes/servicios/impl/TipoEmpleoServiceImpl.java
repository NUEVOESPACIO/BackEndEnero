
package com.sistema.examenes.servicios.impl;
import com.sistema.examenes.entidades.TipoEmpleo;
import com.sistema.examenes.repositorios.TipoEmpleoRepository;
import com.sistema.examenes.servicios.TipoEmpleoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoEmpleoServiceImpl implements TipoEmpleoService {
    
    @Autowired
    private TipoEmpleoRepository  tipoempleoRepository;    

    @Override
    public TipoEmpleo guardarTipoEmpleo(TipoEmpleo tipoempleo) throws Exception {        
        return tipoempleoRepository.save(tipoempleo);    
    }

    @Override
    public void eliminarTipoEmpleo(Long tipoempleoid) {
        
        tipoempleoRepository.deleteById(tipoempleoid);       
        
    }
    
    @Override
    public List<TipoEmpleo> listadeTipoEmpleo() {                      
        
        return tipoempleoRepository.findAll();        
        
    }
    
    
    
    }    
    
    
    