
package com.portfolioBackend.LCC.Service;

import com.portfolioBackend.LCC.Entity.Experiencia;
import com.portfolioBackend.LCC.Repository.IRExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ServExper {
    
     @Autowired
    IRExperiencia irexperiencia;
    
    public List<Experiencia> list(){
        return irexperiencia.findAll();
    }
    
    public Optional<Experiencia> getOne(int id){
        return irexperiencia.findById(id);
    }
    
    public Optional<Experiencia> getByTrabajo(String trabajo){
        return irexperiencia.findByTrabajo(trabajo);
    }
    
    public void save(Experiencia exper){
        irexperiencia.save(exper);
    }
    
    public void delete(int id){
        irexperiencia.deleteById(id);
    }
    
    public boolean existsById(int id){
        return irexperiencia.existsById(id);
    }
    
    public boolean existsByTrabajo(String trabajo){
        return irexperiencia.existsByTrabajo(trabajo);
}
}
