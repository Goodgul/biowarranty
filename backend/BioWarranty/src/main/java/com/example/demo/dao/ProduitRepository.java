package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Produit;

@CrossOrigin("*")
@RestController
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
