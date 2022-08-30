
package com.backend.lccbackend.Service;

import com.backend.lccbackend.Entity.Educacion;
import com.backend.lccbackend.Repository.Repeducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Serveducacion {
    @Autowired
    Repeducacion repeduc;
    
    public List<Educacion> list(){
        return repeduc.findAll();
    }
    
    public Optional<Educacion> getOne(int id){
        return repeduc.findById(id);
    }
    
    public Optional<Educacion> getByEstudio(String estudio){
        return repeduc.findByEstudio(estudio);
    }
    
    public void save(Educacion educacion){
        repeduc.save(educacion);
    }
    
    public void delete(int id){
        repeduc.deleteById(id);
    }
    
    public boolean existsById(int id){
        return repeduc.existsById(id);
    }
    
    public boolean existsByEstudio(String estudio){
        return repeduc.existsByEstudio(estudio);
    }
}
