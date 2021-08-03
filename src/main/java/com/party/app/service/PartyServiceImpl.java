package com.party.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.party.app.entities.Hub;
import com.party.app.entities.Individual;
import com.party.app.entities.Organization;
import com.party.app.exceptions.DatabaseException;
import com.party.app.exceptions.DuplicateRecordException;
import com.party.app.exceptions.RecordNotFoundException;
import com.party.app.repository.HubDao;
import com.party.app.repository.IndividualDao;
import com.party.app.repository.OrganizationDao;

@Service
@Transactional
public class PartyServiceImpl implements PartyService {

	@Autowired
	HubDao daoHub;
	@Autowired
	IndividualDao daoInd;
	@Autowired
	OrganizationDao daoOrg;

	@Override
	public Individual addInd(Individual individual) throws DuplicateRecordException {
		Optional<Individual> getIndId = daoInd.findById(individual.getId());
		if (getIndId.isPresent())
			throw new DuplicateRecordException("The Individual Id is already added");
		else
			return daoInd.save(individual);
	}

	@Override
	public List<Individual> getAllInd() throws DatabaseException {
		if (daoInd.findAll().isEmpty())
			throw new DatabaseException("Empty Database");
		return daoInd.findAll();
	}

	@Override
	public Individual getIndById(int id) throws RecordNotFoundException {
		Optional<Individual> checkInd = daoInd.findById(id);
		if (checkInd.isPresent())
			return checkInd.get();
		else
			throw new RecordNotFoundException("Individual Id Not Found");
	}

	@Override
	public void deleteIndividual(int id) throws RecordNotFoundException {
		Optional<Individual> Ind = daoInd.findById(id);
		if (!Ind.isPresent())
			throw new RecordNotFoundException("Individual Id Not Found");
		else
			daoInd.deleteById(id);
	}

	@Override
	public Organization addOrg(Organization organization) throws DuplicateRecordException {
		Optional<Organization> getOrgId = daoOrg.findById(organization.getId());
		if (getOrgId.isPresent())
			throw new DuplicateRecordException("The Organization Id is already added");
		else
			return daoOrg.save(organization);
	}

	@Override
	public List<Organization> getAllOrg() throws DatabaseException {
		if (daoOrg.findAll().isEmpty())
			throw new DatabaseException("Empty Database");
		return daoOrg.findAll();
	}

	@Override
	public Organization getOrgById(int id) throws RecordNotFoundException {
		Optional<Organization> checkOrg = daoOrg.findById(id);
		if (checkOrg.isPresent())
			return checkOrg.get();
		else
			throw new RecordNotFoundException("Organization Id Not Found");
	}

	@Override
	public void deleteOrganization(int id) throws RecordNotFoundException {
		Optional<Organization> Ind = daoOrg.findById(id);
		if (!Ind.isPresent())
			throw new RecordNotFoundException("Individual Id Not Found");
		else
			daoOrg.deleteById(id);

	}

	@Override
	public Hub addHub(Hub hub) throws DuplicateRecordException {
		Optional<Hub> getHubId = daoHub.findById(hub.getId());
		if (getHubId.isPresent())
			throw new DuplicateRecordException("The Individual Id is already added");
		else
			return daoHub.save(hub);
	}

	@Override
	public List<Hub> getAllHub() throws DatabaseException {
		if (daoHub.findAll().isEmpty())
			throw new DatabaseException("Empty Database");
		return daoHub.findAll();
	}

	@Override
	public Hub getHubById(int id) throws RecordNotFoundException {
		Optional<Hub> checkHub = daoHub.findById(id);
		if (checkHub.isPresent())
			return checkHub.get();
		else
			throw new RecordNotFoundException("Hub Id Not Found");
	}

	@Override
	public void deleteHub(int id) throws RecordNotFoundException {
		Optional<Hub> Hub = daoHub.findById(id);
		if (!Hub.isPresent())
			throw new RecordNotFoundException("Hub Id Not Found");
		else
			daoHub.deleteById(id);

	}

	@Override
	public Individual update(Individual Ind) throws RecordNotFoundException {
		Optional<Individual> id = daoInd.findById(Ind.getId());
		if (!id.isPresent())
			throw new RecordNotFoundException("Individual Id not found can't update");
		else
			return daoInd.save(Ind);
	}

	@Override
	public Organization update(Organization Org) throws RecordNotFoundException {
		Optional<Organization> id = daoOrg.findById(Org.getId());
		if (!id.isPresent())
			throw new RecordNotFoundException("Organization Id not found can't update");
		else
			return daoOrg.save(Org);
	}

	@Override
	public Hub update(Hub Org) throws RecordNotFoundException {
		Optional<Hub> id = daoHub.findById(Org.getId());
		if (!id.isPresent())
			throw new RecordNotFoundException("Hub Id not found can't update");
		else
			return daoHub.save(Org);
	}

}
