
package com.portfolioBackend.LCC.Service;

import com.portfolioBackend.LCC.Entity.Educacion;
import com.portfolioBackend.LCC.Repository.IREducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
    
    @Autowired
    IREducacion ireducacion;
    
        public List<Educacion> list(){
        return ireducacion.findAll();
    }
    
    public Optional<Educacion> getOne(int id){
        return ireducacion.findById(id);
    }
    
    public Optional<Educacion> getByEstudio(String estudio){
        return ireducacion.findByEstudio(estudio);
    }
    
    public void save(Educacion educ){
        ireducacion.save(educ);
    }
    
    public void delete(int id){
        ireducacion.deleteById(id);
    }
    
    public boolean existsById(int id){
        return ireducacion.existsById(id);
    }
    
    public boolean existsByEstudio(String estudio){
        return ireducacion.existsByEstudio(estudio);
    }
    
}
