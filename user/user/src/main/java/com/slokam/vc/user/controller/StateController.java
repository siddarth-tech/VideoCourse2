package com.slokam.vc.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.user.entity.State;
import com.slokam.vc.user.service.StateService;

@RestController
@RequestMapping("State") 
public class StateController {
	 @Autowired
	 private StateService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<State>	 saveState(@RequestBody State obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<State>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<State>	 deleteState(@RequestBody State obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<State>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<State>> getAllState(){
		 List<State> list = service.getAll();
		 return new ResponseEntity<List<State>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<State> getByIdState(@PathVariable Integer id) {
		  State obj =  service.getById(id);
		  return new ResponseEntity<State>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<State>	 
	 deleteState(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<State>(HttpStatus.OK);
	 }
}

