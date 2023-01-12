package com.sistema.examenes.controladores;


import com.sistema.examenes.entidades.Proyectos;

import com.sistema.examenes.servicios.ProyectosService;
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
@RequestMapping("/proyectos")
public class ProyectosController {
    
    @Autowired
    private ProyectosService proyectosservice;   
    
    @CrossOrigin(origins={"http://localhost:4200", "https://frontendnov.web.app"})
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/")    
    public Proyectos guardarProyectos(@RequestBody Proyectos proyecto) throws Exception {        
        return proyectosservice.guardarProyectos(proyecto);          
    }  
    
    @CrossOrigin(origins={"http://localhost:4200", "https://frontendnov.web.app"})
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{proyectoId}") 
    public void eliminarProyecto(@PathVariable("proyectoId") Long proyectoid) {
         
         proyectosservice.eliminarProyectos(proyectoid);         
    
    }
    
    @CrossOrigin(origins={"http://localhost:4200", "https://frontendnov.web.app"})
    @ResponseBody
    @GetMapping("/listar") 
    
    public List<Proyectos> listarProyectos() {         
                  
         return proyectosservice.listadeProyectos();
    
    }
            
    
}
