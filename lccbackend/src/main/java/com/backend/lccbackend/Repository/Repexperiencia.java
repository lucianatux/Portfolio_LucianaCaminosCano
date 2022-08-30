
package com.backend.lccbackend.Repository;

import com.backend.lccbackend.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repexperiencia extends JpaRepository<Experiencia, Integer> {
    public Optional<Experiencia> findByTrabajo(String trabajo);
    public boolean existsByTrabajo(String trabajo);
}
