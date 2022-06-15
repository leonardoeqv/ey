package com.users.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.users.entities.PhoneEntity;

@Repository
public interface PhoneRepository extends JpaRepository<PhoneEntity, Integer> {
	

}