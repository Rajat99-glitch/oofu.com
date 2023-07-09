package com.oofu.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@CrossOrigin(origins = "http://localhost:8083")
@RequestMapping(value = "/api/v1/whatsapp", method = RequestMethod.GET)
public class WhatsappRestController {
	
	@PostMapping("/whatsapp_api")
	public RedirectView whatsappIntegration() throws Exception{
		try {
			System.out.println("Inside WHatsappp Integration Controller");
			String url = "https://wa.me/919763505731";
			RedirectView redirect = new RedirectView();
			redirect.setUrl(url);
			System.out.println("Ending............");
			return redirect;
		}
		catch(Exception e) {
			throw new Exception("Some Issue with Whatsapp Integration");
		}
		
	}

}
