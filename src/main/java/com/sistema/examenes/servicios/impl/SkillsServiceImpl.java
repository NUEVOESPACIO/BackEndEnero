package com.sistema.examenes.servicios.impl;

import com.sistema.examenes.entidades.Skills;
import com.sistema.examenes.repositorios.SkillsRepository;
import com.sistema.examenes.servicios.SkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsServiceImpl implements SkillsService {
    
    @Autowired
    private SkillsRepository  skillsrepository;   

    @Override
    public Skills guardarSkill(Skills skills) throws Exception {
        
        return skillsrepository.save(skills);
       
    }

    @Override
    public void eliminarSkill(Long skillid) {
        
        skillsrepository.deleteById(skillid);
       
    }

    @Override
    public List<Skills> listadeSkills() {
        
        return skillsrepository.findAll();
       
    }
    
    
    
    
    
}
