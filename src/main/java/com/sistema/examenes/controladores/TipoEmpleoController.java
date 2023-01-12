
package com.sistema.examenes.controladores;

import com.sistema.examenes.entidades.TipoEmpleo;
import com.sistema.examenes.servicios.TipoEmpleoService;
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
@RequestMapping("/tipoempleos")
public class TipoEmpleoController {
    
    @Autowired
    private TipoEmpleoService tipoempleoService;   
    
    @CrossOrigin(origins={"http://localhost:4200", "https://frontendnov.web.app"})
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/")    
    public TipoEmpleo guardarTipoEmpleo(@RequestBody TipoEmpleo tipoempleo) throws Exception {

        
        return tipoempleoService.guardarTipoEmpleo(tipoempleo);
    
    }    
   
    @CrossOrigin(origins={"http://localhost:4200", "https://frontendnov.web.app"})
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{tipoEmpleoId}") 
    public void eliminarTipoEmpleo(@PathVariable("tipoEmpleoId") Long tipoempleoId) {
         
         tipoempleoService.eliminarTipoEmpleo(tipoempleoId);         
    
    }
    
    @CrossOrigin(origins={"http://localhost:4200", "https://frontendnov.web.app"})
    @ResponseBody
    @GetMapping("/listar") 
    
    public List<TipoEmpleo> listarTipoEmpleo() {         
                  
         return tipoempleoService.listadeTipoEmpleo();       
    
    }
}