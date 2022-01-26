package com.example.demo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Client;

@CrossOrigin ("*")
@RestController
public interface ClientRepository extends JpaRepository<Client, Long>{
	
	  @RestResource(path="/byNomClient") 
	  public List<Client>findByNomClientContains(@Param("name")String nomClient);	 
	
}
