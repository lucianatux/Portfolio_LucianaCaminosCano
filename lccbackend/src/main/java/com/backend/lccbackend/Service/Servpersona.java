
package com.backend.lccbackend.Service;

import com.backend.lccbackend.Entity.Persona;
import com.backend.lccbackend.Interface.Intpersonaserv;
import com.backend.lccbackend.Repository.Reppersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servpersona implements Intpersonaserv {
    @Autowired Reppersona reppers;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = reppers.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        reppers.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        reppers.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = reppers.findById(id).orElse(null);
        return persona;
    }
}
