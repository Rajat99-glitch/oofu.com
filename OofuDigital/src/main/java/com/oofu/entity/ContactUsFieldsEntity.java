package com.oofu.entity;

//import javax.validation.constraints.Size;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "contactus_details")
public class ContactUsFieldsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	//@NotBlank(message="Name cannot be empty!")
	//@Size(min=3, max=12, message="User name must be between 3-12 characters!")
	private String name;
	
//	@Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")
	private String email;
	
	//@NotBlank(message="Subject cannot be empty!")
	private String subject;
	
	//@NotBlank(message = "Please fill the message to us!")
	private String message;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ContactUsFieldsEntity [name=" + name + ", email=" + email + ", subject=" + subject + ", message="
				+ message + "]";
	}
	
}
