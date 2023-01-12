
package com.sistema.examenes.controladores;

import com.sistema.examenes.entidades.Educacion;
import com.sistema.examenes.servicios.EducacionService;
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
@RequestMapping("/educacion")
public class EducacionController {
    
    @Autowired
    private EducacionService educacionService;   
    
    @CrossOrigin(origins={"http://localhost:4200", "https://frontendnov.web.app"})
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/")    
    public Educacion guardarEducacion(@RequestBody Educacion educacion) throws Exception {

        
        return educacionService.guardarEducacion(educacion);
    
    }    
   
    @CrossOrigin(origins={"http://localhost:4200", "https://frontendnov.web.app"})
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{educacionId}") 
    public void eliminarEducacion(@PathVariable("educacionId") Long educacionId) {
         
         educacionService.eliminarEducacion(educacionId);         
    
    }
    
    @CrossOrigin(origins={"http://localhost:4200", "https://frontendnov.web.app"})
    @ResponseBody
    @GetMapping("/listar") 
    
    public List<Educacion> listarEducacion() {         
                  
         return educacionService.listadeEducacion();       
    
    }
}