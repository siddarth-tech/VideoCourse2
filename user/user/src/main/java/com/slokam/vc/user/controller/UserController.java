package com.slokam.vc.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.user.entity.User;
import com.slokam.vc.user.service.UserService;

@RestController
@RequestMapping("User") 
public class UserController {
	 @Autowired
	 private UserService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<User>	 saveUser(@RequestBody User obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<User>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<User>	 deleteUser(@RequestBody User obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<User>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<User>> getAllUser(){
		 List<User> list = service.getAll();
		 return new ResponseEntity<List<User>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<User> getByIdUser(@PathVariable Integer id) {
		  User obj =  service.getById(id);
		  return new ResponseEntity<User>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<User>	 
	 deleteUser(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<User>(HttpStatus.OK);
	 }
}

