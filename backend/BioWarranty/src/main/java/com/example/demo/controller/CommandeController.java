package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ClientRepository;
import com.example.demo.dao.CommandeRepository;
import com.example.demo.entities.Commande;
import com.example.demo.entities.Client;



@RestController
public class CommandeController {
	
	
	@Autowired
	private CommandeRepository  rcommande;
	
	@Autowired
	private ClientRepository rclient;
	
//////////////**Ajouter Commande**********************//////////////
	
@RequestMapping
(value="/addCommande/{clientId}", method=RequestMethod.POST)
public Commande addCommande(@RequestBody Commande com ,@PathVariable Long clientId) { 
	
	 if(rclient.findById(clientId).isPresent()) {
		 Client c = new Client();
		 c= rclient.findById(clientId).get();
		 com.setClient(c);
		 
	 }return   rcommande.save(com); 
		 
	 }





//////////////////************Get commande by id**************///////////////
@RequestMapping
(value="/getCommande/{commandeId}", method= RequestMethod.GET) 
public Commande getCommande(@PathVariable Long commandeId){ 
	 return	 rcommande.findById(commandeId).orElse(null); }

///////////////////////////********get All commandes **************///////////

@RequestMapping
(value="/getCommande", method= RequestMethod.GET) 
public List<Commande> getCommande(){ return rcommande.findAll(); }



//////////////////////////////*****editCategorie ***********************//////////////////////

@RequestMapping
(value="/editCommande/{commandeId}", method=RequestMethod.PUT)
public Commande editCommande(@PathVariable Long commandeId, @RequestBody Commande com) { 
	 if(rcommande.findById(commandeId).isPresent()) { com.setCommandeId(commandeId);
	 return rcommande.save(com); }else { return com; } }


//////////////////////////////////////////////Supprimer commande////////////////////////


@RequestMapping("/deleteCommande/{commandeId}")

public String deleteCommande (@PathVariable(value="commandeId") Long commandeId) 
{ rcommande.deleteById(commandeId); return
"Supprimer avec succès="+commandeId;

}



}
