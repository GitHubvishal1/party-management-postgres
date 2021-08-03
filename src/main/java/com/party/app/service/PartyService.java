package com.party.app.service;

import java.util.List;

import com.party.app.entities.Hub;
import com.party.app.entities.Individual;
import com.party.app.entities.Organization;
import com.party.app.exceptions.DatabaseException;
import com.party.app.exceptions.DuplicateRecordException;
import com.party.app.exceptions.RecordNotFoundException;

public interface PartyService {

	List<Individual> getAllInd() throws DatabaseException;

	Individual getIndById(int orderId) throws RecordNotFoundException;

	List<Organization> getAllOrg() throws DatabaseException;

	Organization getOrgById(int orderId) throws RecordNotFoundException;

	List<Hub> getAllHub() throws DatabaseException;

	Hub getHubById(int orderId) throws RecordNotFoundException;

	Individual addInd(Individual individual) throws DuplicateRecordException;

	Hub addHub(Hub hub) throws DuplicateRecordException;

	Organization addOrg(Organization organization) throws DuplicateRecordException;

	void deleteIndividual(int id) throws RecordNotFoundException;

	void deleteOrganization(int id) throws RecordNotFoundException;

	void deleteHub(int id) throws RecordNotFoundException;

	Individual update(Individual ind) throws RecordNotFoundException;

	Organization update(Organization ind) throws RecordNotFoundException;

	Hub update(Hub hub) throws RecordNotFoundException;
}
