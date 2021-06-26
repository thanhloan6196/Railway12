package com.vti.entity.Abstraction;

import java.util.ArrayList;

public class VietNamesePhone extends Phone{
	
	static ArrayList<Contact> contacts = new ArrayList<Contact>();

	@Override
	public void insertContact(String name, String phone) {
		Contact contact = new Contact(name, phone);
		contacts.add(contact);
		
	}

	@Override
	public void removeContact(String name) {
		ArrayList<Contact> deleteContacts = new ArrayList<Contact>();
		for (Contact contact : contacts) {
			if ( name.equals(contact.getName())) {
				deleteContacts.add(contact);
			}
		}
		if (deleteContacts.size() > 0) {
			contacts.removeAll(deleteContacts);
			System.err.println(" Ban vua xoa lien he co ten " + name);
		} else {
			System.out.println(" Lien he ban nhap khong co trong danh sach!");
		}
		
	}

	@Override
	public void updateConTact(String name, String newPhone) {
		for (Contact contact : contacts) {
			if (contact.getName().equals(name)) {
				contact.setPhone(newPhone);
				System.out.println(" Contact duowc update nhu sau: " + contact);
			}
		}
		
	}

	@Override
	public void searchContact(String name) {
		for (Contact contact : contacts) {
			if( contact.getName().equals(name)) {
				System.out.println(contact);
			} 
		}
		
	}
	
	public void printContact() {
		for (Contact contact : contacts) {
			System.out.println(contact);
		}
	}

}
