
package com.portfolioBackend.LCC.Repository;

import com.portfolioBackend.LCC.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Repproyectos extends JpaRepository<Proyectos, Integer> {
    public Optional<Proyectos> findByProy(String proy);
    public boolean existsByProy(String proy);
}