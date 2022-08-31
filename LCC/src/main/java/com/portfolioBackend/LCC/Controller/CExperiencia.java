
package com.portfolioBackend.LCC.Controller;

import com.portfolioBackend.LCC.Dto.dtoExperiencia;
import com.portfolioBackend.LCC.Entity.Experiencia;
import com.portfolioBackend.LCC.Security.Controller.Mensaje;
import com.portfolioBackend.LCC.Service.ServExper;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("explab")
@CrossOrigin(origins ="**")


public class CExperiencia {
    @Autowired ServExper servexper;
    
    
    
    @GetMapping("/lista")
    public  ResponseEntity<List<Experiencia>> list(){
        List<Experiencia> list= servexper.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id") int id){
        if(!servexper.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Experiencia experiencia = servexper.getOne(id).get();
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }
    
    
    @PostMapping("/create")
   public ResponseEntity<?> create(@RequestBody dtoExperiencia dtoexp){
        if (StringUtils.isBlank(dtoexp.getTrabajo())){
            return new ResponseEntity(new Mensaje("El nombre del trabajo es obligatorio"), 
            HttpStatus.BAD_REQUEST);
        }
        if(servexper.existsByTrabajo(dtoexp.getTrabajo())){
            return new ResponseEntity(new Mensaje("Esa experiencia ya existe"),
            HttpStatus.BAD_REQUEST);
        }
        Experiencia experiencia = new Experiencia(dtoexp.getTrabajo(),
        dtoexp.getPeriodo(),dtoexp.getDescripcion());
        servexper.save(experiencia);
        return new ResponseEntity(new Mensaje("Experiencia agregada"),
        HttpStatus.OK);
   }   
   
   
   
   @PutMapping("/update/{id}")
   public ResponseEntity<?> update(@PathVariable("id") int id,
           @RequestBody dtoExperiencia dtoexp){
       if(!servexper.existsById(id)){
           return new ResponseEntity(new Mensaje("El id no existe"),
           HttpStatus.BAD_REQUEST);
       }
       if(servexper.existsByTrabajo(dtoexp.getTrabajo())&& 
               servexper.getByTrabajo(dtoexp.getTrabajo())
               .get().getId() != id){
           return new ResponseEntity(new Mensaje("Esa experiencia ya existe"),
           HttpStatus.BAD_REQUEST);
       }
       if(StringUtils.isBlank(dtoexp.getTrabajo())){
            return new ResponseEntity(new Mensaje("El nombre del trabajo es obligatorio"), 
                    HttpStatus.BAD_REQUEST);
       }
        Experiencia experiencia = servexper.getOne(id).get();
        experiencia.setTrabajo(dtoexp.getTrabajo());
        experiencia.setPeriodo(dtoexp.getPeriodo());
        experiencia.setDescripcion(dtoexp.getDescripcion());
        
        servexper.save(experiencia);
            return new ResponseEntity(new Mensaje("Experiencia actualizada"), 
                HttpStatus.OK);
       }
   
   
   
   @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!servexper.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), 
                    HttpStatus.NOT_FOUND);
        }
        servexper.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), 
                HttpStatus.OK);
    }
   
   
   }
    
