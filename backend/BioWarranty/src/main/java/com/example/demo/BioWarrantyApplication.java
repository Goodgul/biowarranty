package com.example.demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.demo.dao.ClientRepository;
import com.example.demo.entities.Client;

import net.bytebuddy.utility.RandomString;

@SpringBootApplication
public class BioWarrantyApplication implements CommandLineRunner {

	@Autowired
	private ClientRepository cRepo;		
	@Autowired
	RepositoryRestConfiguration rrc;
	
	public static void main(String[] args) {
		SpringApplication.run(BioWarrantyApplication.class, args);
	}		

	@Override
	public void run(String... args) throws Exception {
		
		rrc.exposeIdsFor(Client.class);
		
		
		 
		
		}
		
	
}


