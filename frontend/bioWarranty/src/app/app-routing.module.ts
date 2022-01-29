import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccueilComponent } from './components/accueil/accueil.component';
import { AuthentificationComponent } from './components/authentification/authentification.component';
import { ContacteComponent } from './components/contacte/contacte.component';
import { NousConnaitreComponent } from './components/nous-connaitre/nous-connaitre.component';
import { PageDemarrageComponent } from './components/page-demarrage/page-demarrage.component';
import { PanierComponent } from './components/panier/panier.component';
import { ProduitsComponent } from './components/produits/produits.component';

const routes: Routes = [
  // { path: '/', component:PageDemarrageComponent },


  { path: 'accueil', component: AccueilComponent },
  { path: 'produit', component: ProduitsComponent },
  { path: 'authentification', component: AuthentificationComponent},
  { path: 'nousConnaitre', component: NousConnaitreComponent},
  { path: 'contact', component: ContacteComponent},
  { path: 'panier', component: PanierComponent},




];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
