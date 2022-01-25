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

import net.bytebuddy.utility.RandomString;


@RestController
public class ClientController {
	
	@Autowired
	private ClientRepository cRepository;
	
	/*
	 * //Get un client
	 * 
	 * @RequestMapping(value="/getClient/{id}", method= RequestMethod.GET) public
	 * Client getClient(@PathVariable Long id){ return
	 * cRepository.findById(id).orElse(null); }
	 * 
	 * //Get les clients
	 * 
	 * @RequestMapping(value="/getClients", method= RequestMethod.GET) public
	 * List<Client> getClients(){ return cRepository.findAll(); }
	 * 
	 * //Add bibliotheque
	 * 
	 * @RequestMapping(value="/addClient", method=RequestMethod.POST) public Client
	 * addClient(@RequestBody Client c) { return cRepository.save(c); }
	 * 
	 * //Edit
	 * 
	 * @RequestMapping(value="/editClient/{id}", method=RequestMethod.PUT) public
	 * Client editClient(@PathVariable Long id, @RequestBody Client c) { if
	 * (cRepository.findById(id).isPresent()) { c.setClientId(id); return
	 * cRepository.save(c); }else { return c; } }
	 * 
	 * //Delete bibliotheque avec id
	 * 
	 * @RequestMapping(value="/deleteClient/{id}", method=RequestMethod.DELETE)
	 * public boolean deleteClient(@PathVariable Long id) {
	 * cRepository.deleteById(id); return true; }
	 * 
	 * //add client aléatoire
	 * 
	 * @PostMapping(value="/addClientAleatoire/{nbr}") public boolean
	 * addClientAleatoire(@PathVariable int nbr){ Random rand = new Random(); for
	 * (int i=0; i<=nbr;i++) { cRepository.save(new
	 * Client(null,RandomString.make(100),RandomString.make(100),RandomString.make(
	 * 100),RandomString.make(100),RandomString.make(100))); } return true; }
	 * 
	 * //rechercher client par mot clé
	 * 
	 * @GetMapping("/rechercherClient/{motCle}") public List<Client>
	 * rechercherBibliotheque(@PathVariable String motCle){ return
	 * cRepository.findByNomClientContains(motCle); }
	 */
    
}
