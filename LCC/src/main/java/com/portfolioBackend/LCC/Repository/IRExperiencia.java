
package com.portfolioBackend.LCC.Repository;

import com.portfolioBackend.LCC.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRExperiencia extends JpaRepository<Experiencia, Integer> {
    public Optional<Experiencia> findByTrabajo(String trabajo);
    public boolean existsByTrabajo(String trabajo);
}
