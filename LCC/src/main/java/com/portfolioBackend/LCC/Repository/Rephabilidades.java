
package com.portfolioBackend.LCC.Repository;

import com.portfolioBackend.LCC.Entity.Habilidades;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Rephabilidades  extends JpaRepository<Habilidades, Integer>{
    public Optional<Habilidades> findBySkill(String skill);
    public boolean existsBySkill(String skill);
}
