package com.slokam.vc.user.service.impl;

import com.slokam.vc.user.entity.User;
import com.slokam.vc.user.repo.UserRepo;
import com.slokam.vc.user.service.UserService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService {

      
   

	@Autowired
	private UserRepo repo;
	
	@Override
	public List<User> getAll() {
		return repo.findAll();
	}

	@Override
	public User getById(Integer id) {
		
		Optional<User> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public User save(User todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(User todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
