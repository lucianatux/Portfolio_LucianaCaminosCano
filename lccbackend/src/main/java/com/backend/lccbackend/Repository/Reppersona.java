
package com.backend.lccbackend.Repository;

import com.backend.lccbackend.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Reppersona extends JpaRepository<Persona,Long>{
    
}
