import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Habilidades } from 'src/app/model/habilidades';
import { HabilidadesService } from 'src/app/service/habilidades.service';

@Component({
  selector: 'app-nueva-skill',
  templateUrl: './nueva-skill.component.html',
  styleUrls: ['./nueva-skill.component.css']
})
export class NuevaSkillComponent implements OnInit {
  skill: string = '';
  porcentaje: number = 0;
  imagen: string = '';

  constructor(private servhab: HabilidadesService, private router: Router) { }

  ngOnInit(): void {
  }

  onCreate(): void {
    const habil = new Habilidades(this.skill, this.porcentaje, this.imagen);
    this.servhab.save(habil).subscribe(
      (data) => {
        alert('Habilidad añadida');
        this.router.navigate(['']);
      },
      (err) => {
        alert('Falló');
        this.router.navigate(['']);
      }
    );
  }

}
