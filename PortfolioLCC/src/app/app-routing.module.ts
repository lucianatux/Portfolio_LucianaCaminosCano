import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditEducacionComponent } from './components/educacion/edit-educacion.component';
import { NuevaEducacionComponent } from './components/educacion/nueva-educacion.component';
import { EditExperienciaComponent } from './components/experiencia/edit-experiencia.component';
import { NuevaExperienciaComponent } from './components/experiencia/nueva-experiencia/nueva-experiencia.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { NuevoProyectoComponent } from './components/proyectos/nuevo-proyecto.component';
import { EditProyectoComponent } from './components/proyectos/edit-proyecto.component';
import { NuevaSkillComponent } from './components/skills/nueva-skill.component';
import { EditSkillComponent } from './components/skills/edit-skill.component';

const routes: Routes = [
  {path: '', component:HomeComponent},
  {path: 'login', component:LoginComponent},
  {path: 'nuevaexp', component: NuevaExperienciaComponent},
  {path: 'editexp/:id', component: EditExperienciaComponent},
  {path: 'nuevaeduc', component: NuevaEducacionComponent},
  {path: 'editeduc/:id', component: EditEducacionComponent},
  {path: 'nuevoproy', component: NuevoProyectoComponent},
  {path: 'editproy/:id', component: EditProyectoComponent},
  {path: 'nuevahab', component: NuevaSkillComponent},
  {path: 'editskill/:id', component: EditSkillComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
