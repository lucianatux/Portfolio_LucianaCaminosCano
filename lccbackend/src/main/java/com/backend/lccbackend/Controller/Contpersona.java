
package com.backend.lccbackend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.backend.lccbackend.Entity.Persona;
import com.backend.lccbackend.Interface.Intpersonaserv;
import java.util.List;
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
@CrossOrigin(origins = "http://localhost:4200")
public class Contpersona {
    @Autowired Intpersonaserv intperserv;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return intperserv.getPersona();
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        intperserv.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        intperserv.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido,
                               @RequestParam("titulo") String nuevotitulo,
                                @RequestParam("img") String nuevaimg,
                                @RequestParam("descripcion") String nuevadescripcion,
                                @RequestParam("telefono") String nuevotelefono,
                                @RequestParam("correo") String nuevocorreo,
                                @RequestParam("instagram") String nuevoinstagram,
                                @RequestParam("github") String nuevogithub,
                                @RequestParam("linkedin") String nuevolinkedin,
                                @RequestParam("banner") String nuevobanner){
        Persona persona = intperserv.findPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setTitulo(nuevotitulo);
         persona.setImg(nuevaimg);
         persona.setDescripcion(nuevadescripcion);
         persona.setTelefono(nuevotelefono);
         persona.setCorreo(nuevocorreo);
         persona.setInstagram(nuevoinstagram);
         persona.setGithub(nuevogithub);
         persona.setLinkedin(nuevolinkedin);
         persona.setBanner(nuevobanner);
        
        intperserv.savePersona(persona);
        return persona;
    }
    
    @GetMapping("personas/traer/perfil")
    public Persona findPersona(){
        return intperserv.findPersona((long)1);
    }
   
}
