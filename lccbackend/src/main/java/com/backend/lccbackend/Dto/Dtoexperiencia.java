
package com.backend.lccbackend.Dto;

import javax.validation.constraints.NotBlank;


public class Dtoexperiencia {
    @NotBlank
    private String trabajo;
    @NotBlank
    private String periodo;
    @NotBlank
    private String descripcion;

    public Dtoexperiencia() {
    }

    public Dtoexperiencia(String trabajo, String periodo, String descripcion) {
        this.trabajo = trabajo;
        this.periodo = periodo;
        this.descripcion = descripcion;
    }

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
