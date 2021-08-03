package com.party.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.party.app.entities.Individual;

@Repository
public interface IndividualDao extends JpaRepository<Individual, Integer> {

	Optional<Individual> findById(Individual id);

}
