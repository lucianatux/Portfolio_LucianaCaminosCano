
package com.backend.lccbackend.Service;

import com.backend.lccbackend.Entity.Experiencia;
import com.backend.lccbackend.Repository.Repexperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Servexperiencia {
    @Autowired
     Repexperiencia repexp;
     
     public List<Experiencia> list(){
         return repexp.findAll();
     }
     
     public Optional<Experiencia> getOne(int id){
         return repexp.findById(id);
     }
     
     public Optional<Experiencia> getByTrabajo(String trabajo){
         return repexp.findByTrabajo(trabajo);
     }
     
     public void save(Experiencia experiencia){
         repexp.save(experiencia);
     }
     
     public void delete(int id){
         repexp.deleteById(id);
     }
     
     public boolean existsById(int id){
         return repexp.existsById(id);
     }
     
     public boolean existsByTrabajo(String trabajo){
         return repexp.existsByTrabajo(trabajo);
     }
}
