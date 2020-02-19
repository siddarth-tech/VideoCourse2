package com.slokam.vc.user.service.impl;

import com.slokam.vc.user.entity.Religion;
import com.slokam.vc.user.repo.ReligionRepo;
import com.slokam.vc.user.service.ReligionService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ReligionServiceImpl implements ReligionService {

      
   

	@Autowired
	private ReligionRepo repo;
	
	@Override
	public List<Religion> getAll() {
		return repo.findAll();
	}

	@Override
	public Religion getById(Integer id) {
		
		Optional<Religion> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Religion save(Religion todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Religion todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
