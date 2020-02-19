package com.slokam.vc.user.service;

import com.slokam.vc.user.entity.Country;
import com.slokam.vc.user.repo.CountryRepo;

import java.util.*;

public interface CountryService {
	
	public List<Country> getAll();
	public Country getById(Integer id);
	public Country save(Country Country);
	public void remove(Country Country);
    public void remove(Integer id);
}
