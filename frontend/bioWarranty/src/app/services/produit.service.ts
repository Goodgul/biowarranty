import { HttpClient } from '@angular/common/http'
import { Injectable } from '@angular/core'

@Injectable({
  providedIn: 'root',
})
export class ProduitService {
  url = 'http://localhost:8089/produits'

  constructor(private http: HttpClient) {}

  addProduitService(produit: any) {
    return this.http.post(this.url, produit)
  }

  editProduitService(produits: any) {
    return this.http.put(this.url + '/' + produits.id, produits)
  }

  deleteProduitService(idbproduits: any) {
    return this.http.delete(this.url + '/' + idbproduits)
  }

  getProduitsService() {
    return this.http.get(this.url)
  }


  searchMotCleService(mc: any) {
    return this.http.get(this.url + '/search/ByName?name=' + mc)
  }
}
