package com.sistema.examenes.repositorios;

import com.sistema.examenes.entidades.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProyectosRepository extends JpaRepository<Proyectos, Long>{
    
}
