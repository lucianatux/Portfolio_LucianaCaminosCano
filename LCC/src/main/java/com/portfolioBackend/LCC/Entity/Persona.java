
package com.portfolioBackend.LCC.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull 
    private String nombre;
    @NotNull
    private String apellido;
    private String titulo;
    private String img;
    private String descripcion;
    private String telefono;
    private String correo;
    private String instagram;
    private String github;
    private String linkedin;
    private String banner;
   
    
    
}
