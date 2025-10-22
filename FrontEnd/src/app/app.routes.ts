import { Routes } from '@angular/router';
import { NavbarComponent } from './navbar/navbar.component';
import { HomeComponent } from './home/home.component';

export const routes: Routes = [{
    path: 'home',
    component: HomeComponent
},
{
    path: 'navbar',
    component: NavbarComponent
}];
