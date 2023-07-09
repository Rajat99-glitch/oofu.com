package com.oofu.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.oofu.entity.ContactUsFieldsEntity;
import com.oofu.service.SaveContactDetailsService;


@Controller
@RequestMapping(value="/api/v1/contact")
public class ContactUsRestController {
	
	@Autowired
	public SaveContactDetailsService saveContactDetails;
	
	@PostMapping(value = "/contactus")
	public ResponseEntity<ModelAndView> contactUs(@ModelAttribute("contactus") ContactUsFieldsEntity contactus, BindingResult br){
		System.out.println("Contact Details "+contactus);
		if(!br.hasErrors()) {
			this.saveContactDetails.saveEmployee(contactus);
			ModelAndView modelAndView = new ModelAndView("contact");
			return ResponseEntity.ok(modelAndView);
		}
		else {
			System.out.println("Status Bad Request");
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
