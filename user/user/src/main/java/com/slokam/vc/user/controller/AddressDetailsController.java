package com.slokam.vc.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.user.entity.AddressDetails;
import com.slokam.vc.user.service.AddressDetailsService;

@RestController
@RequestMapping("AddressDetails") 
public class AddressDetailsController {
	 @Autowired
	 private AddressDetailsService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<AddressDetails>	 saveAddressDetails(@RequestBody AddressDetails obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<AddressDetails>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<AddressDetails>	 deleteAddressDetails(@RequestBody AddressDetails obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<AddressDetails>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<AddressDetails>> getAllAddressDetails(){
		 List<AddressDetails> list = service.getAll();
		 return new ResponseEntity<List<AddressDetails>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<AddressDetails> getByIdAddressDetails(@PathVariable Integer id) {
		  AddressDetails obj =  service.getById(id);
		  return new ResponseEntity<AddressDetails>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<AddressDetails>	 
	 deleteAddressDetails(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<AddressDetails>(HttpStatus.OK);
	 }
}

