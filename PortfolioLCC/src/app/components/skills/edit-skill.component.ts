import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Habilidades } from 'src/app/model/habilidades';
import { HabilidadesService } from 'src/app/service/habilidades.service';

@Component({
  selector: 'app-edit-skill',
  templateUrl: './edit-skill.component.html',
  styleUrls: ['./edit-skill.component.css']
})
export class EditSkillComponent implements OnInit {
  habilidad: Habilidades = null;

  constructor(private servhab: HabilidadesService, private activatedRouter: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    const id = this.activatedRouter.snapshot.params['id'];
    this.servhab.detail(id).subscribe(
      data =>{
        this.habilidad = data;
      }, err =>{
        alert("Error al modificar habilidad en ngOnInit");
        this.router.navigate(['']);
      }
    )
  }

  onUpdate(): void{
    const id = this.activatedRouter.snapshot.params['id'];
    this.servhab.update(id, this.habilidad).subscribe(
      data => {
        this.router.navigate(['']);
      }, err =>{
         alert("Error al modificar habilidad en onUpdate");
         this.router.navigate(['']);
      }
    )
  }

}
