package com.bridgelabz.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AddressBookManager {
	List<PersonDetails> addressBookList = new ArrayList();
	
	void addPerson(PersonDetails address) {
		addressBookList.add(address);
	}
	
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
}
