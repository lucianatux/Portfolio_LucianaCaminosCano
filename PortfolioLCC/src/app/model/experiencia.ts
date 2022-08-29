export class Experiencia {
    id? : number;
    trabajo: string;
    periodo: string;
    descripcion: string;

    constructor(trabajo: string, periodo: string, descripcion: string) {
        this.trabajo = trabajo;
        this.periodo = periodo;
        this.descripcion = descripcion;
    };
}
