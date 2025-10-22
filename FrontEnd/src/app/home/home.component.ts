import { Component, OnInit } from '@angular/core';
import { UsuarioService } from '../usuario.service';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit{
  usuarios: string = ""
  constructor(private svc: UsuarioService){ }

  obtener(){
    this.svc.getUsuarios()
  }
  
  ngOnInit(){
      this.obtener()
  }
}
