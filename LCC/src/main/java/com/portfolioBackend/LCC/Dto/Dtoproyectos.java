
package com.portfolioBackend.LCC.Dto;

import javax.validation.constraints.NotBlank;


public class Dtoproyectos {
    @NotBlank
    private String proy;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String enlace;

    public Dtoproyectos() {
    }

    public Dtoproyectos(String proy, String descripcion, String enlace) {
        this.proy = proy;
        this.descripcion = descripcion;
        this.enlace = enlace;
    }

    public String getProy() {
        return proy;
    }

    public void setProy(String proy) {
        this.proy = proy;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
}
