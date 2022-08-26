
package com.portfolioBackend.LCC.Repository;

import com.portfolioBackend.LCC.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IREducacion extends JpaRepository<Educacion, Integer> {
    public Optional<Educacion> findByEstudio(String estudio);
    public boolean existsByEstudio(String estudio);
}
