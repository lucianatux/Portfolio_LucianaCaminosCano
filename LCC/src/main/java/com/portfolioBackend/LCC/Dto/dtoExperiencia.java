
package com.portfolioBackend.LCC.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String trabajo;
    @NotBlank
    private String periodo;
    @NotBlank
    private String descripcion;
    
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String trabajo, String periodo, String descripcion) {
        this.trabajo = trabajo;
        this.periodo = periodo;
        this.descripcion = descripcion;
    }
    
    //Getters y Setters

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
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
