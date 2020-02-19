package com.slokam.vc.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.user.entity.Religion;
import com.slokam.vc.user.service.ReligionService;

@RestController
@RequestMapping("Religion") 
public class ReligionController {
	 @Autowired
	 private ReligionService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Religion>	 saveReligion(@RequestBody Religion obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Religion>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Religion>	 deleteReligion(@RequestBody Religion obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Religion>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Religion>> getAllReligion(){
		 List<Religion> list = service.getAll();
		 return new ResponseEntity<List<Religion>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Religion> getByIdReligion(@PathVariable Integer id) {
		  Religion obj =  service.getById(id);
		  return new ResponseEntity<Religion>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<Religion>	 
	 deleteReligion(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Religion>(HttpStatus.OK);
	 }
}

