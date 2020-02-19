package com.slokam.vc.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.user.entity.AddType;
import com.slokam.vc.user.service.AddTypeService;

@RestController
@RequestMapping("AddType") 
public class AddTypeController {
	 @Autowired
	 private AddTypeService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<AddType>	 saveAddType(@RequestBody AddType obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<AddType>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<AddType>	 deleteAddType(@RequestBody AddType obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<AddType>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<AddType>> getAllAddType(){
		 List<AddType> list = service.getAll();
		 return new ResponseEntity<List<AddType>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<AddType> getByIdAddType(@PathVariable Integer id) {
		  AddType obj =  service.getById(id);
		  return new ResponseEntity<AddType>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<AddType>	 
	 deleteAddType(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<AddType>(HttpStatus.OK);
	 }
}

