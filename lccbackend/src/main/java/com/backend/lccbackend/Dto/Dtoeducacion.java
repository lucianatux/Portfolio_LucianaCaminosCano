
package com.backend.lccbackend.Dto;

import javax.validation.constraints.NotBlank;


public class Dtoeducacion {
   @NotBlank
    private String estudio;
   @NotBlank
    private String periodo;
   @NotBlank
    private String descripcion;

    public Dtoeducacion() {
    }

    public Dtoeducacion(String estudio, String periodo, String descripcion) {
        this.estudio = estudio;
        this.periodo = periodo;
        this.descripcion = descripcion;
    }

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
