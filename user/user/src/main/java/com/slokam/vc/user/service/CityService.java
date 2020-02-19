package com.slokam.vc.user.service;

import com.slokam.vc.user.entity.City;
import com.slokam.vc.user.repo.CityRepo;

import java.util.*;

public interface CityService {
	
	public List<City> getAll();
	public City getById(Integer id);
	public City save(City City);
	public void remove(City City);
    public void remove(Integer id);
}
