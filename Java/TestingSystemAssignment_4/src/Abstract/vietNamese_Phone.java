package Abstract;

import java.util.ArrayList;

public class vietNamese_Phone extends Phone {
	
	ArrayList<Contact> contacts;

	@Override
	public void insertContact(String name, String phone) {
		Contact contact = new Contact(name, phone);
		contacts.add(contact);
		
	}

	@Override
	public void searchContact(String name) {
		for (Contact contact : contacts) {
			if (contact.name.equals(name)) {
				System.out.println(contact);
			}
		}
		
		
	}

}
