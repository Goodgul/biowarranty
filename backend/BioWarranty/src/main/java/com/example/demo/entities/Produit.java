package com.example.demo.entities;


import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long produitId;
	private String nomProduit;
	@Column(length=1000)
	private String descriptionProduit;
	private double prixProduitHT;
	private String photoProduit;
	private boolean disponible;
	private int quantiteProduit;
	
	
	@ManyToOne
	private Categorie categorie;
	
	
	@ManyToMany 
	private List<Commande> commandes;


	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}

}
