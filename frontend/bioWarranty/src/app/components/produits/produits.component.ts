import { Component, OnInit } from '@angular/core'
import { ProduitService } from 'src/app/services/produit.service'

@Component({
  selector: 'app-produits',
  templateUrl: './produits.component.html',
  styleUrls: ['./produits.component.css'],
})
export class ProduitsComponent implements OnInit {
  produitattribus = {
    produitId: '',
    nomProduit: '',
    descriptionProduit: '',
    prixProduitHT: '',
    photoProduit: '',
    disponible: '',
    quantiteProduit: '',
  }

  constructor(private serviceProduit: ProduitService) {}

  tableauproduit: any

  ngOnInit(): void {
    this.getProduitsTs()
  }

  addProduitTs(produit: any) {
    console.log(produit.value)
    let data = produit.value
    this.serviceProduit.addProduitService(produit).subscribe((data) => {
      console.log('Vous avez enregistré un nouveau produit!')
      this.produitattribus = produit
    })
  }

  editProduitTs() {
    this.serviceProduit
      .editProduitService(this.produitattribus)
      .subscribe((data) => {
        console.log(
          "L'établissement que vous avez inseré fait desormais partie du réseaux des bibliothèques d'Aix",
        )
      })
  }

  deleteProduitTs(t: any) {
    this.serviceProduit.deleteProduitService(t.id).subscribe((data) => {
      console.log('Vous avez bien supprimé le produit selectionné')
    })
  }

  getProduitsTs() {
    this.serviceProduit.getProduitsService().subscribe((data) => {
      this.tableauproduit = data
      //console.log(this.tableauproduit)
    })
  }



  searchProduit(keyword: any) {
    //console.log(keyword.form.value.nom)
    let mc = keyword.form.value.nomProduit
    this.serviceProduit.searchMotCleService(mc).subscribe((data) => {
      this.tableauproduit = data
    })
  }
}
