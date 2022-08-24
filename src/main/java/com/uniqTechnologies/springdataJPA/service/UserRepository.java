package com.uniqTechnologies.springdataJPA.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uniqTechnologies.springdataJPA.entity.*;

public interface UserRepository extends JpaRepository<User, Long>{

}
