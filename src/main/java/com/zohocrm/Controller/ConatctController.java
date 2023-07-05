package com.zohocrm.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.Entities.Contact;
import com.zohocrm.services.ContactService;

@Controller
public class ConatctController {
	
	private ContactService contactService;

	public ConatctController(ContactService contactService) {
		this.contactService = contactService;
	}



	@RequestMapping("/listallcontact")
	public String listAllContacts(Model model) {
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts",contacts);
		return"list_contacts";
	}

}
