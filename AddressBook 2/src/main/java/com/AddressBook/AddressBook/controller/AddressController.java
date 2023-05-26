package com.AddressBook.AddressBook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.AddressBook.AddressBook.model.AddressBook;
import com.AddressBook.AddressBook.services.AddressService;


@Controller
@RequestMapping(value="/address")
public class AddressController {
	@Autowired
	AddressService addressService;
	
	
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list() {
		 
	  ModelAndView model = new ModelAndView("address_list");
	  List<AddressBook> addressList = addressService.getAllAddress();
	  model.addObject("addressList", addressList);
	
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/addAddress/", method=RequestMethod.GET)
	 public ModelAndView addAddress() {
		 
	  ModelAndView model = new ModelAndView();
	  AddressBook address = new AddressBook();
	  model.addObject("addressForm", address);
	  model.setViewName("address_form");
	  
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/editAddress/{id}", method=RequestMethod.GET)
	 public ModelAndView editAddress(@PathVariable int id) {
	  ModelAndView model = new ModelAndView();
	  
	  AddressBook address = addressService.getAddressById(id);
	  model.addObject("addressForm", address);
	  model.setViewName("address_form");
	  
	  return model;
	 }
	 
	 
	 @RequestMapping(value="/addAddress", method=RequestMethod.POST)
	 public ModelAndView add(@ModelAttribute("addressForm") AddressBook address) {
		 
	  addressService.addAddress(address);
	  return new ModelAndView("redirect:/address/list");
	  
	 }
	 
	 @RequestMapping(value="/deleteAddress/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") int id) {
		 
	  addressService.deleteAddress(id);
	  return new ModelAndView("redirect:/address/list");

}
}