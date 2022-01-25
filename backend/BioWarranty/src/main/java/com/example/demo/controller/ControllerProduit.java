package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ProduitRepository;




@RestController
public class ControllerProduit {

	@Autowired
	private  ProduitRepository produitrepo;
	
}
