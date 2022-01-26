package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Categorie;

@CrossOrigin("*")
@RestController
public interface CategorieRepository extends JpaRepository<Categorie, Long>{
	
	 /////////////////////////////////Recherche cateogrie par mot clé///////////////////////////
	
	  @RestResource(path="/Bycategoriename")
	
	public List<Categorie> findBynomCategorieContains(@Param("nomCategorie") String nomCategorie);
	 
	

}
