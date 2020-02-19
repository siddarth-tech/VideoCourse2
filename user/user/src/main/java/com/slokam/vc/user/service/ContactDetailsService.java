package com.slokam.vc.user.service;

import com.slokam.vc.user.entity.ContactDetails;
import com.slokam.vc.user.repo.ContactDetailsRepo;

import java.util.*;

public interface ContactDetailsService {
	
	public List<ContactDetails> getAll();
	public ContactDetails getById(Integer id);
	public ContactDetails save(ContactDetails ContactDetails);
	public void remove(ContactDetails ContactDetails);
    public void remove(Integer id);
}
