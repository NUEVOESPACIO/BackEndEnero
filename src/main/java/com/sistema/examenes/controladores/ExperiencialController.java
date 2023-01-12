
package com.sistema.examenes.controladores;

import com.sistema.examenes.entidades.Experiencial;
import com.sistema.examenes.servicios.ExperiencialService;
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
@RequestMapping("/experiencial")
public class ExperiencialController {
    
    @Autowired
    private ExperiencialService experiencialservice;   
    
    @CrossOrigin(origins={"http://localhost:4200", "https://frontendnov.web.app"})
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/")    
    public Experiencial guardarExperiencial(@RequestBody Experiencial experiencial) throws Exception {

        
        return experiencialservice.guardarExperiencial(experiencial);
        
    
    }    
   
    @CrossOrigin(origins={"http://localhost:4200", "https://frontendnov.web.app"})
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{experiencialId}") 
    public void eliminarExperiencial(@PathVariable("experiencialId") Long experiencialid) {
         
         experiencialservice.eliminarExperiencial(experiencialid);         
    
    }
    
    @CrossOrigin(origins={"http://localhost:4200", "https://frontendnov.web.app"})
    @ResponseBody
    @GetMapping("/listar") 
    
    public List<Experiencial> listarEducacion() {         
                  
         return experiencialservice.listadeExperiencial();       
    
    }
}