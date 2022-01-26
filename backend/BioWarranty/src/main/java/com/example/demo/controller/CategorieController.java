package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CategorieRepository;
import com.example.demo.entities.Categorie;


@RestController
public class CategorieController {

	@Autowired
	private CategorieRepository rcategorie;
	
	//////////////**Ajouter Categorie**********************//////////////
	@RequestMapping
	(value="/addCategorie", method=RequestMethod.POST)
	public Categorie addCategorie(@RequestBody Categorie cat) { 
		return rcategorie.save(cat); }
	
	
	//////////////////************Get un Categorie by id**************///////////////
	 @RequestMapping
	 (value="/getCategorie/{categorieId}", method= RequestMethod.GET) 
	 public Categorie getCategorie(@PathVariable Long categorieId){ 
		 return	 rcategorie.findById(categorieId).orElse(null); }
	 
	 //////////////////////////////*****getCategories All***********************////////////////////
	 
	 
	 @RequestMapping
	 (value="/getCategorie", method= RequestMethod.GET) 
	 public List<Categorie> getCategorie(){ return rcategorie.findAll(); }
	
	 //////////////////////////////*****editCategorie ***********************//////////////////////
	 
	 @RequestMapping
	 (value="/editCategorie/{categorieId}", method=RequestMethod.PUT)
	 public Categorie editCategorie(@PathVariable Long categorieId, @RequestBody Categorie cat) { 
		 if(rcategorie.findById(categorieId).isPresent()) { cat.setCategorieId(categorieId);
		 return rcategorie.save(cat); }else { return cat; } }
	 
	 
//////////////////////////////////////////////Supprimer categorie////////////////////////
	 
	 
	 @RequestMapping("/deleteCategorie/{categorieId}")
	  
	  public String deleteCategorie (@PathVariable(value="categorieId") Long categorieId) 
	 { rcategorie.deleteById(categorieId); return
	  "Supprimer avec succès="+categorieId;
	  
	  }
	 
	
	
	
}










