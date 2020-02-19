package com.slokam.vc.user.service;

import com.slokam.vc.user.entity.User;
import com.slokam.vc.user.repo.UserRepo;

import java.util.*;

public interface UserService {
	
	public List<User> getAll();
	public User getById(Integer id);
	public User save(User User);
	public void remove(User User);
    public void remove(Integer id);
}
