package com.oofu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oofu.entity.ContactUsFieldsEntity;

public interface SaveContactDetailsRepo extends JpaRepository<ContactUsFieldsEntity, Long>{
	
}
