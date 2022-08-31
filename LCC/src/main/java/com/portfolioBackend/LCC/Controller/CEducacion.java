
package com.portfolioBackend.LCC.Controller;

import com.portfolioBackend.LCC.Dto.dtoEducacion;
import com.portfolioBackend.LCC.Entity.Educacion;
import com.portfolioBackend.LCC.Security.Controller.Mensaje;
import com.portfolioBackend.LCC.Service.SEducacion;
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
@RequestMapping("educacion")
@CrossOrigin(origins ="**")
public class CEducacion {
    @Autowired SEducacion serveduc;
    
    
    
    @GetMapping("/lista")
    public  ResponseEntity<List<Educacion>> list(){
        List<Educacion> list= serveduc.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id")int id){
        if(!serveduc.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }
        Educacion educacion = serveduc.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
    
    
    
    @PostMapping("/create")
   public ResponseEntity<?> create(@RequestBody dtoEducacion dtoeduc){
        if (StringUtils.isBlank(dtoeduc.getEstudio())){
            return new ResponseEntity(new Mensaje("El nombre del estudio es obligatorio"), 
            HttpStatus.BAD_REQUEST);
        }
        if(serveduc.existsByEstudio(dtoeduc.getEstudio())){
            return new ResponseEntity(new Mensaje("Esa educación ya existe"),
            HttpStatus.BAD_REQUEST);
        }
        Educacion educacion = new Educacion(dtoeduc.getEstudio(),
        dtoeduc.getPeriodo(),dtoeduc.getDescripcion());
        serveduc.save(educacion);
        return new ResponseEntity(new Mensaje("Educación agregada"),
        HttpStatus.OK);
   }
   
   
   
   @PutMapping("/update/{id}")
   public ResponseEntity<?> update(@PathVariable("id") int id,
           @RequestBody dtoEducacion dtoeduc){
       if(!serveduc.existsById(id)){
           return new ResponseEntity(new Mensaje("El id no existe"),
           HttpStatus.NOT_FOUND);
       }
       if(serveduc.existsByEstudio(dtoeduc.getEstudio())&& 
               serveduc.getByEstudio(dtoeduc.getEstudio())
               .get().getId() != id){
           return new ResponseEntity(new Mensaje("Esa educación ya existe"),
           HttpStatus.BAD_REQUEST);
       }
       if(StringUtils.isBlank(dtoeduc.getEstudio())){
            return new ResponseEntity(new Mensaje("El nombre del estudio es obligatorio"), 
                    HttpStatus.BAD_REQUEST);
       }
        Educacion educacion = serveduc.getOne(id).get();
        educacion.setEstudio(dtoeduc.getEstudio());
        educacion.setPeriodo(dtoeduc.getPeriodo());
        educacion.setDescripcion(dtoeduc.getDescripcion());
        
        serveduc.save(educacion);
            return new ResponseEntity(new Mensaje("Educación actualizada"), 
                HttpStatus.OK);
       }
   
   
   
   @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!serveduc.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe el id"), 
                    HttpStatus.NOT_FOUND);
        }
        serveduc.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), 
                HttpStatus.OK);
    }
}
