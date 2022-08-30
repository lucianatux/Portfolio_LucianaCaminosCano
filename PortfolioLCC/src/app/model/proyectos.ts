export class Proyectos {
    id?: number;
    proy: string;
    descripcion: string;
    enlace: string;

    constructor( proy: string, descripcion: string, enlace: string ) {
        this.proy = proy;
        this.descripcion = descripcion;
        this.enlace = enlace;
    }
}
