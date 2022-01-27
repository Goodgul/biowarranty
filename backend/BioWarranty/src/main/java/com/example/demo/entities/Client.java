package com.example.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor  
@AllArgsConstructor  
@Entity
public class Client{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long clientId;
	@Column(length=1000)
	private String nomClient;
	@Column(length=1000)
	private String prenomClient;
	@Column(length=1000)
	private String adresseClient;
	@Column(length=1000)
	private String mailClient;
	@Column(length=1000)
	private String telephoneClient;
	
	 @OneToMany(mappedBy = "client") 
	 private List<Commande> commandes;
	 
	 @OneToMany(mappedBy = "client")
	 private List<Commentaire> commentaires;
	 
	



	  
	
	

}
