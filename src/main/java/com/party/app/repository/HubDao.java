package com.party.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.party.app.entities.Hub;

@Repository
public interface HubDao extends JpaRepository<Hub, Integer> {

	Optional<Hub> findById(int id);

}
