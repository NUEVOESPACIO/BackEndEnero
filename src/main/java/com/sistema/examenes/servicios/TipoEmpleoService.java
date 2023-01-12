package com.sistema.examenes.servicios;
import com.sistema.examenes.entidades.TipoEmpleo;
import java.util.List;

public interface TipoEmpleoService {
    
    public TipoEmpleo guardarTipoEmpleo(TipoEmpleo tipoEmpleo) throws Exception;
    
    public void eliminarTipoEmpleo(Long tipoEmpleoId);
    
    public List<TipoEmpleo> listadeTipoEmpleo();
    
}