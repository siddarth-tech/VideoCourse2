package com.slokam.vc.user.service;

import com.slokam.vc.user.entity.Religion;
import com.slokam.vc.user.repo.ReligionRepo;

import java.util.*;

public interface ReligionService {
	
	public List<Religion> getAll();
	public Religion getById(Integer id);
	public Religion save(Religion Religion);
	public void remove(Religion Religion);
    public void remove(Integer id);
}
