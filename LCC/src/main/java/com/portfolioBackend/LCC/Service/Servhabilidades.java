
package com.portfolioBackend.LCC.Service;

import com.portfolioBackend.LCC.Entity.Habilidades;
import com.portfolioBackend.LCC.Repository.Rephabilidades;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class Servhabilidades {
   @Autowired
     Rephabilidades rephab;
     
     public List<Habilidades> list(){
         return rephab.findAll();
     }
     
     public Optional<Habilidades> getOne(int id){
         return rephab.findById(id);
     }
     
     public Optional<Habilidades> getBySkill(String skill){
         return rephab.findBySkill(skill);
     }
     
     public void save(Habilidades habilidad){
         rephab.save(habilidad);
     }
     
     public void delete(int id){
         rephab.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rephab.existsById(id);
     }
     
     public boolean existsBySkill(String skill){
         return rephab.existsBySkill(skill);
     }   
}
