package com.sistema.examenes.controladores;

import com.sistema.examenes.entidades.Personas;
import com.sistema.examenes.servicios.PersonasService;
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
@RequestMapping("/personas")
public class PersonasController {
    
    
    @Autowired
    private PersonasService personasservice;   
    
    @CrossOrigin(origins={"http://localhost:4200", "https://frontendnov.web.app"})
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/")    
    public Personas guardarPersonas(@RequestBody Personas personas) throws Exception {        
        return personasservice.guardarPersona(personas);          
    }  
    
    @CrossOrigin(origins={"http://localhost:4200", "https://frontendnov.web.app"})
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{personaid}") 
    public void eliminarPersona(@PathVariable("personaid") Long personaid) {
         
         personasservice.eliminarPersona(personaid);
    
    }
    
    @CrossOrigin(origins={"http://localhost:4200", "https://frontendnov.web.app"})
    @ResponseBody
    @GetMapping("/listar")    
    public List<Personas> listadePersonas() {         
                  
         return personasservice.listadePersonas();
    
    }
            
    
    
}
