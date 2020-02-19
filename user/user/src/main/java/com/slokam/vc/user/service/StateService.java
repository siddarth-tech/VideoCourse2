package com.slokam.vc.user.service;

import com.slokam.vc.user.entity.State;
import com.slokam.vc.user.repo.StateRepo;

import java.util.*;

public interface StateService {
	
	public List<State> getAll();
	public State getById(Integer id);
	public State save(State State);
	public void remove(State State);
    public void remove(Integer id);
}
