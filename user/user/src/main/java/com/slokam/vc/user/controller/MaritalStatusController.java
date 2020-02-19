package com.slokam.vc.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.user.entity.MaritalStatus;
import com.slokam.vc.user.service.MaritalStatusService;

@RestController
@RequestMapping("MaritalStatus") 
public class MaritalStatusController {
	 @Autowired
	 private MaritalStatusService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<MaritalStatus>	 saveMaritalStatus(@RequestBody MaritalStatus obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<MaritalStatus>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<MaritalStatus>	 deleteMaritalStatus(@RequestBody MaritalStatus obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<MaritalStatus>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<MaritalStatus>> getAllMaritalStatus(){
		 List<MaritalStatus> list = service.getAll();
		 return new ResponseEntity<List<MaritalStatus>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<MaritalStatus> getByIdMaritalStatus(@PathVariable Integer id) {
		  MaritalStatus obj =  service.getById(id);
		  return new ResponseEntity<MaritalStatus>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<MaritalStatus>	 
	 deleteMaritalStatus(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<MaritalStatus>(HttpStatus.OK);
	 }
}

