package com.slokam.vc.user.service;

import com.slokam.vc.user.entity.Gender;
import com.slokam.vc.user.repo.GenderRepo;

import java.util.*;

public interface GenderService {
	
	public List<Gender> getAll();
	public Gender getById(Integer id);
	public Gender save(Gender Gender);
	public void remove(Gender Gender);
    public void remove(Integer id);
}
