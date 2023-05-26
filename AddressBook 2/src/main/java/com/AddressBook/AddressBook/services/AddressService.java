package com.AddressBook.AddressBook.services;

import java.util.List;

import com.AddressBook.AddressBook.model.AddressBook;


public interface AddressService {
	
	public List<AddressBook> getAllAddress();
	 
	public AddressBook getAddressById(int id);
	 
	public void addAddress(AddressBook address);
	 
	public void deleteAddress(int id);

}
