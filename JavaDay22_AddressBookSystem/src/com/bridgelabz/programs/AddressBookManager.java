package com.bridgelabz.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.Scanner;

public class AddressBookManager {
	List<PersonDetails> addressBookList = new ArrayList();
	Scanner sc = new Scanner(System.in);
	
	void addPerson(PersonDetails address) {
		addressBookList.add(address);
	}
	
	//----------------method to add person details--------
	void addPersonDetails(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter firstName: ");
		String firstName = sc.next();
		System.out.print("Enter lastName: ");
		String lastName = sc.next();
		System.out.print("Enter address: ");
		String address = sc.next();
		System.out.print("Enter city: ");
		String city = sc.next();
		System.out.print("Enter state: ");
		String state = sc.next();
		System.out.print("Enter email: ");
		String email = sc.next();
		System.out.print("Enter zip: ");
		int zip = sc.nextInt();
		System.out.print("Enter phoneNumber: ");
		int phoneNumber = sc.nextInt();
		
		PersonDetails personDetails = new PersonDetails();
		personDetails.setFirstName(firstName);
		personDetails.setLastName(lastName);
		personDetails.setAddress(address);
		personDetails.setCity(city);
		personDetails.setState(state);
		personDetails.setEmail(email);
		personDetails.setZip(zip);
		personDetails.setPhoneNumber(phoneNumber);
		addPerson(personDetails);
	}

	//----------------method to get person details--------
	PersonDetails getperson(String name) {
		Iterator iterator = addressBookList.iterator();
		for(PersonDetails elements : addressBookList ) {
			if (iterator.hasNext()) {
				PersonDetails item = (PersonDetails) iterator.next();
				if(item.getFirstName().equalsIgnoreCase(name)) {
					return item;
				}
			}		
		}
		return null;	
	}
	
	//----------------method to update person details--------
	void updatePersonDetails() {
		
		System.out.print("Enter person name: ");
		String item = sc.next();
		PersonDetails bookitem = getperson(item);
		System.out.println(bookitem);
		
		System.out.println("1. update firstname");
		System.out.println("2. update Lastname");
		System.out.println("3. update address");
		System.out.println("4. update city");
		System.out.println("5. update state");
		System.out.println("6. update email");
		System.out.println("7. update zip");
		System.out.println("8. update phone number");
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("Enter new first name: ");
				String fname = sc.next();
				bookitem.setFirstName(fname);
				break;
			case 2:
				System.out.println("Enter new last name: ");
				String lname = sc.next();
				bookitem.setLastName(lname);
				break;
			case 3:
				System.out.println("Enter new address: ");
				String address = sc.next();
				bookitem.setAddress(address);
				break;
			 case 4:
				 System.out.println("Enter new city: ");
				 String city = sc.next();
				 bookitem.setCity(city);
	             break;
			 case 5:
				 System.out.println("Enter new State: ");
				 String state = sc.next();
				 bookitem.setState(state);
				 break;
			 case 6:
				 System.out.println("Enter new Email: ");
				 String email = sc.next();
				 bookitem.setEmail(email);
				 break;
			 case 7:
				 System.out.println("Enter new ZipCode: ");
				 int zip = sc.nextInt();
				 bookitem.setZip(zip);
				 break;
			 case 8:
				 System.out.println("Enter new phone number: ");
				 int phonnum = sc.nextInt();
				 bookitem.setPhoneNumber(phonnum);
				 break;
		}
		System.out.println("Updated details = "+bookitem);
	}
}
