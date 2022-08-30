
package com.portfolioBackend.LCC.Service;

import com.portfolioBackend.LCC.Entity.Proyectos;
import com.portfolioBackend.LCC.Repository.Repproyectos;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class Servproyectos {
    @Autowired
    Repproyectos repproy;
    
    public List<Proyectos> list(){
         return repproy.findAll();
     }
     
     public Optional<Proyectos> getOne(int id){
         return repproy.findById(id);
     }
     
     public Optional<Proyectos> getByProy(String proy){
         return repproy.findByProy(proy);
     }
     
     public void save(Proyectos proyecto){
         repproy.save(proyecto);
     }
     
     public void delete(int id){
         repproy.deleteById(id);
     }
     
     public boolean existsById(int id){
         return repproy.existsById(id);
     }
     
     public boolean existsByProy(String proy){
         return repproy.existsByProy(proy);
     }
    
}

