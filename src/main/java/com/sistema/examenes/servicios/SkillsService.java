package com.sistema.examenes.servicios;

import com.sistema.examenes.entidades.Skills;
import java.util.List;


public interface SkillsService {
 
    public Skills guardarSkill(Skills skills) throws Exception;
    
    public void eliminarSkill(Long skillid);
    
    public List<Skills> listadeSkills();
    
    
}
