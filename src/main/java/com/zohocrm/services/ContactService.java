package com.zohocrm.services;

import java.util.List;

import com.zohocrm.Entities.Contact;

public interface ContactService {
	
public void saveContact(Contact contact);

public List<Contact> getAllContacts();

public Contact getContactById(long id);



}
