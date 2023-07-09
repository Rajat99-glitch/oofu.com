package com.oofu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oofu.entity.ContactUsFieldsEntity;
import com.oofu.repo.SaveContactDetailsRepo;

@Service
public class SaveContactDetailsService {
	
	private final SaveContactDetailsRepo contactDetailsRepo;

    @Autowired
    public SaveContactDetailsService(SaveContactDetailsRepo contactDetailsRepo) {
        this.contactDetailsRepo = contactDetailsRepo;
    }

    public void saveEmployee(ContactUsFieldsEntity contactUsFields) {
    	contactDetailsRepo.save(contactUsFields);
    }

}
