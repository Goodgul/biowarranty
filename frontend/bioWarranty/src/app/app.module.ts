import { NgModule } from '@angular/core'
import { BrowserModule } from '@angular/platform-browser'
import { HttpClientModule } from '@angular/common/http'
import { FormsModule, ReactiveFormsModule } from '@angular/forms'
import { AppRoutingModule } from './app-routing.module'
import { AppComponent } from './app.component'
import { AccueilComponent } from './components/accueil/accueil.component'
import { ProduitsComponent } from './components/produits/produits.component'
import { AuthentificationComponent } from './components/authentification/authentification.component'
import { PanierComponent } from './components/panier/panier.component'
import { PageDemarrageComponent } from './components/page-demarrage/page-demarrage.component'
import { FooterComponent } from './components/footer/footer.component'
import { NousConnaitreComponent } from './components/nous-connaitre/nous-connaitre.component'
import { ContacteComponent } from './components/contacte/contacte.component'

@NgModule({
  declarations: [
    AppComponent,
    AccueilComponent,
    ProduitsComponent,
    AuthentificationComponent,
    PanierComponent,
    PageDemarrageComponent,
    FooterComponent,
    NousConnaitreComponent,
    ContacteComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
