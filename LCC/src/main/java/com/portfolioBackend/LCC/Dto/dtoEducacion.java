
package com.portfolioBackend.LCC.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String estudio;
    @NotBlank
    private String periodo;
    @NotBlank
    private String descripcion;
    
    //Constructores

    public dtoEducacion() {
    }

    public dtoEducacion(String estudio, String periodo, String descripcion) {
        this.estudio = estudio;
        this.periodo = periodo;
        this.descripcion = descripcion;
    }
    
    //Getters y Setters

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
