package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.ProduitRepository;
import com.example.demo.dao.CategorieRepository;
import com.example.demo.entities.Categorie;
import com.example.demo.entities.Produit;




@RestController
public class ControllerProduit {

	@Autowired
	private  ProduitRepository pRepo;
	@Autowired
	private  CategorieRepository rcategorie;
	
	
	
//CRUD: CREATE = ADD - insertion d'un produit TESTEE = OK
//		@RequestMapping(value="/addProduit", method = RequestMethod.POST)
//		@ResponseBody
//		public Produit addProduit (@RequestBody Produit p) {
//		return pRepo.save(p);
//		}
	
	
//CRUD: CREATE = ADD - insertion d'un produit avec categorieId TESTEE = OK	
	@RequestMapping
	(value="/addProduit/{categorieId}", method=RequestMethod.POST)
	public Produit addProduit(@RequestBody Produit prod ,@PathVariable Long categorieId) { 

	     if(rcategorie.findById(categorieId).isPresent()) {
	         Categorie c = new Categorie();
	         c= rcategorie.findById(categorieId).get();
	         prod.setCategorie(c);
	     }
	     return   pRepo.save(prod); 
	     }

		
//CRUD: READ = GET - récuperation d' un seul produit TESTEE = OK
		@RequestMapping(value="/getProduit/{produitId}", method = RequestMethod.GET)
		@ResponseBody
		public Produit getProduit (@PathVariable("produitId") Long produitId) {
		return  pRepo.findById(produitId).orElse(null);
		}	
		
//CRUD: READ = GET - récuperation plusieurs produits TESTEE = OK
		@RequestMapping(value="/getProduits", method = RequestMethod.GET)
		@ResponseBody
		public List<Produit> getProduits(){
		return pRepo.findAll();
		}
		
//CRUD: UPDATE = EDIT - modification =  "put" TESTEE = OK
		@RequestMapping(value="/editProduit/{produitId}", method = RequestMethod.PUT)
				
		public Produit editProduit(@PathVariable Long produitId,@RequestBody Produit p) {
		System.out.println(produitId);
				
		p.setProduitId(produitId);                    
		return pRepo.save(p);
		}
		
//CRUD: DELETE = DELETE - suppression de plusieurs produits TESTEE = OK
		@RequestMapping(value="/deleteProduits", method = RequestMethod.DELETE)
		@ResponseBody
	    public  boolean  deleteProduits(){
	    pRepo.deleteAll();
		return true;
		}

//CRUD: DELETE = DELETE - suppression d'un seul produit TESTEE = 
		@RequestMapping(value="/deleteProduit/{produitId}", method = RequestMethod.DELETE)
		@ResponseBody
		public boolean deleteProduit (@PathVariable Long produitId) {
		pRepo.deleteById(produitId);
		return true;	
		}
	
}
