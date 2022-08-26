export class persona{
    id?:number;
    nombre:string;
    apellido:string;
    titulo:string;
    img:string;
    descripcion:string;
    telefono:string;
    correo:string;
    instagram:string;
    github:string;
    linkedin:string;
    banner:string;

    constructor (nombre:string,
        apellido:string,
        titulo:string,
        img:string,
        descripcion:string,
        telefono:string,
        correo:string,
        instagram:string,
        github:string,
        linkedin:string,
        banner:string) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.img = img;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.correo = correo;
        this.instagram = instagram;
        this.github = github;
        this.linkedin = linkedin;
        this.banner = banner;
        }

}


    
    
   
    
    
    