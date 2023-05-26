package com.AddressBook.AddressBook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.AddressBook.AddressBook.model.AddressBook;
import com.AddressBook.AddressBook.repository.AddressRepository;


@Service
@Transactional
public class AddressServiceImplementation implements AddressService {
	
	@Autowired
	AddressRepository addressRepository;
	
	
	@Override
	public List<AddressBook> getAllAddress() {
		return (List<AddressBook>) addressRepository.findAll();
	}

	@Override
	public AddressBook getAddressById(int id) {
		return addressRepository.findById(id).get();
	}

	@Override
	public void addAddress(AddressBook address) {
		addressRepository.save(address);
	}

	@Override
	public void deleteAddress(int id) {
		addressRepository.deleteById(id);
	}

}
