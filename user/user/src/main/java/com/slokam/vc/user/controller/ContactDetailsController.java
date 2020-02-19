package com.slokam.vc.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.user.entity.ContactDetails;
import com.slokam.vc.user.service.ContactDetailsService;

@RestController
@RequestMapping("ContactDetails") 
public class ContactDetailsController {
	 @Autowired
	 private ContactDetailsService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<ContactDetails>	 saveContactDetails(@RequestBody ContactDetails obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<ContactDetails>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<ContactDetails>	 deleteContactDetails(@RequestBody ContactDetails obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<ContactDetails>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<ContactDetails>> getAllContactDetails(){
		 List<ContactDetails> list = service.getAll();
		 return new ResponseEntity<List<ContactDetails>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<ContactDetails> getByIdContactDetails(@PathVariable Integer id) {
		  ContactDetails obj =  service.getById(id);
		  return new ResponseEntity<ContactDetails>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<ContactDetails>	 
	 deleteContactDetails(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<ContactDetails>(HttpStatus.OK);
	 }
}

