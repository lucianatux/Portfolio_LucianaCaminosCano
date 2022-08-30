export class Habilidades {
    id?: number;
    skill: string;
    porcentaje: number;
    imagen: string;

    constructor(skill: string,porcentaje: number,imagen: string) {
        this.skill = skill;
        this.porcentaje = porcentaje;
        this.imagen = imagen;
    }
}
