package com.party.app.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.party.app.entities.Hub;
import com.party.app.entities.Individual;
import com.party.app.entities.Individual.statusNum;
import com.party.app.entities.Organization;
import com.party.app.entities.Organization.nameTypeNum;
import com.party.app.entities.Organization.orgStatus;
import com.party.app.entities.Organization.typeNum;

@Service
@Transactional
public class PartyServiceImpl implements PartyService {

	List<Individual>list=List.of(
			new Individual(1,"Male","Indian","20/08/1998","Mr","Akhil","Sharma","","Akhil Sharma","Delhi",statusNum.INITIALIZED),
			new Individual(2,"Male","Indian","10/11/1998","Mr","Ravi","Kumar","","Ravi Kumar","Delhi",statusNum.INITIALIZED),
			new Individual(3,"Male","Indian","15/01/1990","Mr","Vikas","Dubey","","Vikas Dubey","Delhi",statusNum.INITIALIZED),
			new Individual(4,"Female","Indian","05/02/1995","Mrs","Angel","Priya","","Angel Priya","Delhi",statusNum.INITIALIZED),
			new Individual(5,"Male","Indian","17/05/1992","Mr","Suresh","Kumar","","Suresh Kumar","Mumbai",statusNum.INITIALIZED)
			);
	
	List<Organization>org=List.of(
			new Organization(1,"legal","linus",orgStatus.INITIALIZED,typeNum.COMPANY,nameTypeNum.CO),
			new Organization(2,"legal","apple",orgStatus.INITIALIZED,typeNum.COMPANY,nameTypeNum.PTY),
			new Organization(3,"legal","google",orgStatus.INITIALIZED,typeNum.COMPANY,nameTypeNum.INC),
			new Organization(4,"legal","samsung",orgStatus.INITIALIZED,typeNum.COMPANY,nameTypeNum.PLC),
			new Organization(5,"legal","lenovo",orgStatus.INITIALIZED,typeNum.COMPANY,nameTypeNum.GMBH)
			);
	
	List<Hub>hub=List.of(new Hub(1,"call","help me"),
			new Hub(2,"call","I am under the water"),
			new Hub(3,"call","here too much raining")
			);
	
	
	@Override
	public List<Individual> getAllInd() {
		return list;
	}

	@Override
	public List<Individual> getIndById(int orderId) {
		return list.stream().filter(list -> list.getId() == orderId).collect(Collectors.toList());
	}

	@Override
	public List<Organization> getAllOrg() {
		return org;
	}

	@Override
	public List<Organization> getOrgById(int orderId) {
		return org.stream().filter(list -> list.getId() == orderId).collect(Collectors.toList());
	}

	@Override
	public List<Hub> getAllHub() {
		return hub;
	}

	@Override
	public List<Hub> getHubById(int orderId) {
		return hub.stream().filter(list -> list.getId() == orderId).collect(Collectors.toList());
	}

}
