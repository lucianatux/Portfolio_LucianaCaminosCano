export class Educacion {
    id?: number;
    estudio: string;
    periodo: string;
    descripcion: string;

    constructor(estudio: string, periodo: string, descripcion: string){
        this.estudio = estudio;
        this.periodo = periodo;
        this.descripcion = descripcion;
    }
}
