package com.party.app.service;

import java.util.List;

import com.party.app.entities.Hub;
import com.party.app.entities.Individual;
import com.party.app.entities.Organization;

public interface PartyService {

	List<Individual> getAllInd();

	List<Individual> getIndById(int orderId);

	List<Organization> getAllOrg();

	List<Organization> getOrgById(int orderId);

	List<Hub> getAllHub();

	List<Hub> getHubById(int orderId);
}
