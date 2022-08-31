
package com.portfolioBackend.LCC.Controller;

import com.portfolioBackend.LCC.Entity.Persona;
import com.portfolioBackend.LCC.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="**")
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
 
    @GetMapping("personas/lista")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/borrar/{id}")
       public String deletePersona(@PathVariable Long id){
           ipersonaService.deletePersona(id);
           return "La persona fue eliminada correctamente";
       }
       
    @GetMapping("personas/traerperfil/{id}")
    public Persona findPersonaid(@PathVariable Long id){
    return ipersonaService.findPersona(id);
    }
               
       @GetMapping("personas/miperfil")
    public Persona findPersona(){
    return ipersonaService.findPersona((long)1); 
    }
       
       //URL:puerto/personas/editar/4?nombre="ejemplo"&apellido="ejemplo"&etc
       @PutMapping("personas/editar/{id}")
       //@PreAuthorize("hasRole('ADMIN')")
     public Persona editPersona(@PathVariable Long id,
                                @RequestParam("nombre") String nuevonombre,
                                @RequestParam("apellido") String nuevoapellido,
                                @RequestParam("titulo") String nuevotitulo,
                                @RequestParam("img") String nuevaimg,
                                @RequestParam("descripcion") String nuevadescripcion,
                                @RequestParam("telefono") String nuevotelefono,
                                @RequestParam("correo") String nuevocorreo,
                                @RequestParam("instagram") String nuevoinstagram,
                                @RequestParam("github") String nuevogithub,
                                @RequestParam("linkedin") String nuevolinkedin,
                                @RequestParam("banner") String nuevobanner){
         Persona persona= ipersonaService.findPersona(id);
         persona.setNombre(nuevonombre);
         persona.setApellido(nuevoapellido);
         persona.setTitulo(nuevotitulo);
         persona.setImg(nuevaimg);
         persona.setDescripcion(nuevadescripcion);
         persona.setTelefono(nuevotelefono);
         persona.setCorreo(nuevocorreo);
         persona.setInstagram(nuevoinstagram);
         persona.setGithub(nuevogithub);
         persona.setLinkedin(nuevolinkedin);
         persona.setBanner(nuevobanner);
         
         ipersonaService.savePersona(persona);
         return persona;
         
     }  
}
