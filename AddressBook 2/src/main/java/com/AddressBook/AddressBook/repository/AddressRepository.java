package com.AddressBook.AddressBook.repository;

import com.AddressBook.AddressBook.model.AddressBook;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<AddressBook, Integer>{

}

