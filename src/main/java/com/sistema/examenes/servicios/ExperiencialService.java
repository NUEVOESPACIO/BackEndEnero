
package com.sistema.examenes.servicios;

import com.sistema.examenes.entidades.Experiencial;
import java.util.List;


public interface ExperiencialService {
    
    public Experiencial guardarExperiencial(Experiencial experiencial) throws Exception;
    
    public void eliminarExperiencial(Long experiencialid);
    
    public List<Experiencial> listadeExperiencial();
    
}
