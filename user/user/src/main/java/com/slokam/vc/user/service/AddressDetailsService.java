package com.slokam.vc.user.service;

import com.slokam.vc.user.entity.AddressDetails;
import com.slokam.vc.user.repo.AddressDetailsRepo;

import java.util.*;

public interface AddressDetailsService {
	
	public List<AddressDetails> getAll();
	public AddressDetails getById(Integer id);
	public AddressDetails save(AddressDetails AddressDetails);
	public void remove(AddressDetails AddressDetails);
    public void remove(Integer id);
}
