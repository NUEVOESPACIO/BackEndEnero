
package com.sistema.examenes.controladores;


import com.sistema.examenes.entidades.Skills;
import com.sistema.examenes.entidades.TipoEmpleo;
import com.sistema.examenes.servicios.SkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skills")
public class SkillsController {
    
    
    @Autowired
    private SkillsService skillsservice;   
    
    @CrossOrigin(origins={"http://localhost:4200", "https://frontendnov.web.app"})
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/")    
    public Skills guardarSkills(@RequestBody Skills skill) throws Exception {        
        return skillsservice.guardarSkill(skill);          
    }  
    
    @CrossOrigin(origins={"http://localhost:4200", "https://frontendnov.web.app"})
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{skillid}") 
    public void eliminarSkill(@PathVariable("skillid") Long skillid) {
         
         skillsservice.eliminarSkill(skillid);         
    
    }
    
    @CrossOrigin(origins={"http://localhost:4200", "https://frontendnov.web.app"})
    @ResponseBody
    @GetMapping("/listar")     
    public List<Skills> listarSkills() {         
                  
         return skillsservice.listadeSkills();
         
         
    
    
}

}
