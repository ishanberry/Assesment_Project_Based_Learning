package com.assignment.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.test.entites.CompositeKey;
import com.assignment.test.entites.Insurance;
@Repository
public interface InsuranceRepository extends JpaRepository<Insurance,  CompositeKey> {

	
	
	
	
}
