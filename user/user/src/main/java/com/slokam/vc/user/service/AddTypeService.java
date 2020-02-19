package com.slokam.vc.user.service;

import com.slokam.vc.user.entity.AddType;
import com.slokam.vc.user.repo.AddTypeRepo;

import java.util.*;

public interface AddTypeService {
	
	public List<AddType> getAll();
	public AddType getById(Integer id);
	public AddType save(AddType AddType);
	public void remove(AddType AddType);
    public void remove(Integer id);
}
