package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Categorie;

@CrossOrigin("*")
@RestController
public interface RepositoryCategorie extends JpaRepository<Categorie, Long>{

}
