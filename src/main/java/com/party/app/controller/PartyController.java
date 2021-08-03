package com.party.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.party.app.entities.Hub;
import com.party.app.entities.Individual;
import com.party.app.entities.Organization;
import com.party.app.exceptions.DatabaseException;
import com.party.app.exceptions.DuplicateRecordException;
import com.party.app.exceptions.RecordNotFoundException;
import com.party.app.service.PartyService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PartyController {

	@Autowired
	private PartyService service;

	@ApiOperation(value = "Add Individual", response = Individual.class, tags = "Individuals", httpMethod = "POST")
	@PostMapping("/individual/add")
	public ResponseEntity<Individual> addIndividual(@RequestBody Individual individual)
			throws DuplicateRecordException {
		Individual addIndividual = service.addInd(individual);
		return new ResponseEntity<Individual>(addIndividual, HttpStatus.OK);
	}

	@ApiOperation(value = "Get all Individuals", response = Individual.class, tags = "Individuals", httpMethod = "GET")
	@GetMapping("/individual")
	public List<Individual> getAllIndividual() throws DatabaseException {
		return this.service.getAllInd();
	}

	@ApiOperation(value = "Get Individuals by Id", response = Individual.class, tags = "Individuals", httpMethod = "GET")
	@GetMapping("/individual/{tid}")
	public ResponseEntity<Individual> getIndById(@PathVariable("tid") int id) throws RecordNotFoundException {
		Individual getByIndId = service.getIndById(id);
		return new ResponseEntity<Individual>(getByIndId, HttpStatus.OK);
	}

	@ApiOperation(value = "Delete Individual details by Id", response = Individual.class, tags = "Individuals", httpMethod = "DELETE")
	@DeleteMapping("/individual/{tid}")
	public ResponseEntity<String> deleteIndividual(@PathVariable("tid") int id) throws RecordNotFoundException {
		service.deleteIndividual(id);
		return new ResponseEntity<String>("Individual Deleted successfully", HttpStatus.OK);
	}

	@ApiOperation(value = "Update Individual Details", response = Individual.class, tags = "Individuals", httpMethod = "PUT")
	@PutMapping("/individual/{tid}")
	public ResponseEntity<Individual> updateIndividual(@RequestBody Individual ind) throws RecordNotFoundException {
		Individual updateInd = service.update(ind);
		return new ResponseEntity<Individual>(updateInd, HttpStatus.OK);
	}

	@ApiOperation(value = "Get all Organizations", response = Organization.class, tags = "Organizations", httpMethod = "GET")
	@GetMapping("/organization")
	public List<Organization> getAllOrganization() throws DatabaseException {
		return this.service.getAllOrg();
	}

	@ApiOperation(value = "Get Organizations by Id", response = Organization.class, tags = "Organizations", httpMethod = "GET")
	@GetMapping("/organization/{tid}")
	public ResponseEntity<Organization> getOrgById(@PathVariable("tid") int id) throws RecordNotFoundException {
		Organization getByOrgId = service.getOrgById(id);
		return new ResponseEntity<Organization>(getByOrgId, HttpStatus.OK);
	}

	@ApiOperation(value = "Add Organization", response = Organization.class, tags = "Organizations", httpMethod = "POST")
	@PostMapping("/organization/add")
	public ResponseEntity<Organization> addOrganization(@RequestBody Organization organization)
			throws DuplicateRecordException {
		Organization addOrganization = service.addOrg(organization);
		return new ResponseEntity<Organization>(addOrganization, HttpStatus.OK);
	}

	@ApiOperation(value = "Delete Organization details by Id", response = Organization.class, tags = "Organizations", httpMethod = "DELETE")
	@DeleteMapping("/organization/{tid}")
	public ResponseEntity<String> deleteOrganization(@PathVariable("tid") int id) throws RecordNotFoundException {
		service.deleteOrganization(id);
		return new ResponseEntity<String>("Organization Deleted successfully", HttpStatus.OK);
	}

	@ApiOperation(value = "Update Organization Details", response = Organization.class, tags = "Organizations", httpMethod = "PUT")
	@PutMapping("/organization/{tid}")
	public ResponseEntity<Organization> updateOrganization(@RequestBody Organization ind)
			throws RecordNotFoundException {
		Organization updateOrg = service.update(ind);
		return new ResponseEntity<Organization>(updateOrg, HttpStatus.OK);
	}

	@ApiOperation(value = "Add Hub", response = Hub.class, tags = "Hubs", httpMethod = "POST")
	@PostMapping("/hub/add")
	public ResponseEntity<Hub> addHub(@RequestBody Hub hub) throws DuplicateRecordException {
		Hub addHub = service.addHub(hub);
		return new ResponseEntity<Hub>(addHub, HttpStatus.OK);
	}

	@ApiOperation(value = "Get all Hubs", response = Hub.class, tags = "Hubs", httpMethod = "GET")
	@GetMapping("/hub")
	public List<Hub> getAllHub() throws DatabaseException {
		return this.service.getAllHub();
	}

	@ApiOperation(value = "Get Hubs by Id", response = Hub.class, tags = "Hubs", httpMethod = "GET")
	@GetMapping("/hub/{tid}")
	public ResponseEntity<Hub> getHubById(@PathVariable("tid") int id) throws RecordNotFoundException {
		Hub getByHubId = service.getHubById(id);
		return new ResponseEntity<Hub>(getByHubId, HttpStatus.OK);
	}

	@ApiOperation(value = "Delete Hubs details by Id", response = Hub.class, tags = "Hubs", httpMethod = "DELETE")
	@DeleteMapping("/hub/{tid}")
	public ResponseEntity<String> deleteHub(@PathVariable("tid") int id) throws RecordNotFoundException {
		service.deleteHub(id);
		return new ResponseEntity<String>("Hub Deleted successfully", HttpStatus.OK);
	}

	@ApiOperation(value = "Update Hub Details", response = Hub.class, tags = "Hubs", httpMethod = "PUT")
	@PutMapping("/hub/{tid}")
	public ResponseEntity<Hub> updateHub(@RequestBody Hub hub) throws RecordNotFoundException {
		Hub updateHub = service.update(hub);
		return new ResponseEntity<Hub>(updateHub, HttpStatus.OK);
	}
	// http://localhost:5050/swagger-ui.html
}
