package com.party.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.party.app.entities.Hub;
import com.party.app.entities.Individual;
import com.party.app.entities.Organization;
import com.party.app.service.PartyService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PartyController {

	@Autowired
	private PartyService service;

	@ApiOperation(value = "Get all Individuals", response = Individual.class, tags = "Get-Individuals", httpMethod = "GET")
	@GetMapping("/individual") // http://localhost:5050/swagger-ui.html/individual
	public List<Individual> getAllIndividual() {
		return this.service.getAllInd();
	}

	@ApiOperation(value = "Get Individual by Id", response = Individual.class, tags = "Get-Individuals", httpMethod = "GET")
	@GetMapping("/individual/{tid}")
	public List<Individual> getIndividualById(@PathVariable("tid") int id) {
		return this.service.getIndById(id);
	}

	@ApiOperation(value = "Get all Organizations", response = Organization.class, tags = "Get-Organizations", httpMethod = "GET")
	@GetMapping("/organization") // http://localhost:5050/swagger-ui.html/organization
	public List<Organization> getAllOrganization() {
		return this.service.getAllOrg();
	}

	@ApiOperation(value = "Get Organizations by Id", response = Organization.class, tags = "Get-Organizations", httpMethod = "GET")
	@GetMapping("/organization/{tid}")
	public List<Organization> getOrganizationById(@PathVariable("tid") int id) {
		return this.service.getOrgById(id);
	}

	@ApiOperation(value = "Get all Hubs", response = Hub.class, tags = "Get-Hub", httpMethod = "GET")
	@GetMapping("/hub") // http://localhost:5050/swagger-ui.html/hub
	public List<Hub> getAllHub() {
		return this.service.getAllHub();
	}

	@ApiOperation(value = "Get Hubs by Id", response = Hub.class, tags = "Get-Hub", httpMethod = "GET")
	@GetMapping("/hub/{tid}")
	public List<Hub> getHubById(@PathVariable("tid") int id) {
		return this.service.getHubById(id);
	}

}
