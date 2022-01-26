package com.example.demo.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.ClientRepository;
import com.example.demo.entities.Client;



@RestController
public class ClientController {
	/*
	 * @Autowired private ClientRepository cRepository;
	 * 
	 * //Subscribe client
	 * 
	 * @PostMapping("/subscribeClient")
	 * 
	 * public Client subscribeClient(@RequestBody Client c) { return
	 * cRepository.save(c); }
	 */
}
