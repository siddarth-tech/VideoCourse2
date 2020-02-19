package com.slokam.vc.user.service;

import com.slokam.vc.user.entity.MaritalStatus;
import com.slokam.vc.user.repo.MaritalStatusRepo;

import java.util.*;

public interface MaritalStatusService {
	
	public List<MaritalStatus> getAll();
	public MaritalStatus getById(Integer id);
	public MaritalStatus save(MaritalStatus MaritalStatus);
	public void remove(MaritalStatus MaritalStatus);
    public void remove(Integer id);
}
