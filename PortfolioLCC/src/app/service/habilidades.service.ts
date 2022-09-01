import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Habilidades } from '../model/habilidades';

@Injectable({
  providedIn: 'root'
})
export class HabilidadesService {
  URL = 'https://backendlcc.herokuapp.com/habilidades/';

  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<Habilidades[]>{
    return this.httpClient.get<Habilidades[]>(this.URL + 'lista');
  }

  public detail(id: number): Observable<Habilidades>{
    return this.httpClient.get<Habilidades>(this.URL + `detail/${id}`);
  }

  public save(habilidad: Habilidades): Observable<any>{
    return this.httpClient.post<any>(this.URL + 'create', habilidad);
  }

  public update(id: number, habilidad: Habilidades): Observable<any>{
    return this.httpClient.put<any>(this.URL + `update/${id}`, habilidad);
  }

  public delete(id: number): Observable<any>{
    return this.httpClient.delete<any>(this.URL + `delete/${id}`);
  }
  
}
