
package com.portfolioBackend.LCC.Dto;

import javax.validation.constraints.NotBlank;


public class Dtohabilidades {
    @NotBlank
    private String skill;
    private int porcentaje;
    @NotBlank
    private String imagen;

    public Dtohabilidades() {
    }

    public Dtohabilidades(String skill, int porcentaje, String imagen) {
        this.skill = skill;
        this.porcentaje = porcentaje;
        this.imagen = imagen;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
