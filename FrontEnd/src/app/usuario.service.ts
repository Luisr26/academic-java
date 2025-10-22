import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  constructor(
    private http: HttpClient
  ) { }
  getUsuarios() {
    return this.http.get('https://localhost:8081/api/usuarios');
  }
}
