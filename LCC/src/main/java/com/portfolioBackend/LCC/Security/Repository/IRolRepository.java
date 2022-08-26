
package com.portfolioBackend.LCC.Security.Repository;

import com.portfolioBackend.LCC.Security.Entity.Rol;
import com.portfolioBackend.LCC.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
