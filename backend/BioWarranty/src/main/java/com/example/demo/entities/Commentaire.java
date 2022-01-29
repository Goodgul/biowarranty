package com.example.demo.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor  
@AllArgsConstructor  
@Entity
public class Commentaire {
	 @Id
  	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long commentaireId;
	 private String texteCommentaire;
	 private String date;
	 
	 @OneToOne
	 private Produit produit;
	 
	 @OneToOne
	 private Client client;
	 
	

}
