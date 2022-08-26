
package com.portfolioBackend.LCC.Controller;

//import org.apache.commons.lang3.StringUtils;
//import com.portfolioBackend.LCC.Dto.dtoExperiencia;
import com.portfolioBackend.LCC.Entity.Experiencia;
import com.portfolioBackend.LCC.Service.ServExper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("explab")
@CrossOrigin(origins ="http://localhost:4200")

public class CExperiencia {
    @Autowired ServExper servexper;
    
    @GetMapping("/listatrabajo")
    public  ResponseEntity<List<Experiencia>> list(){
        List<Experiencia> list= servexper.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
  //  public ResponseEntity<?> create(@RequestBody dtoExperiencia dtoexp){
   //     if (StringUtils.isBlank(dtoexp.getTrabajo())){
   //         return new ResponseEntity(new Mensaje("El nombre del trabajo es obligatorio"), 
   //         HttpStatus.BAD_REQUEST);
  //      }
    
    
    
}
