package com.slokam.vc.user.service.impl;

import com.slokam.vc.user.entity.MaritalStatus;
import com.slokam.vc.user.repo.MaritalStatusRepo;
import com.slokam.vc.user.service.MaritalStatusService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class MaritalStatusServiceImpl implements MaritalStatusService {

      
   

	@Autowired
	private MaritalStatusRepo repo;
	
	@Override
	public List<MaritalStatus> getAll() {
		return repo.findAll();
	}

	@Override
	public MaritalStatus getById(Integer id) {
		
		Optional<MaritalStatus> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public MaritalStatus save(MaritalStatus todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(MaritalStatus todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
