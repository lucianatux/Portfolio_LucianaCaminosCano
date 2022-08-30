
package com.backend.lccbackend.Repository;

import com.backend.lccbackend.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repeducacion extends JpaRepository<Educacion, Integer>{
    public Optional<Educacion> findByEstudio(String estudio);
    public boolean existsByEstudio(String estudio);
}
