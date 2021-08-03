package com.party.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.party.app.entities.Organization;

@Repository
public interface OrganizationDao extends JpaRepository<Organization, Integer> {

	Optional<Organization> findById(int id);

}
