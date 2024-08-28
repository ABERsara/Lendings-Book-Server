package Lendi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import Lendi.models.Customer;
import Lendi.services.iservices.iCustomerService;

@CrossOrigin(origins = {"http://localhost:2000", "http://localhost:2001"})//זה קשור רק לחיבור לקליינט

@RestController
public class CustomerController {
	
	@Autowired
private iCustomerService service;
	
	@GetMapping("/customers")
	public List<Customer> GetAllCustomers(){
		return service.GetAll();
	}
	
	@GetMapping("/customers/{id}")
	public Optional<Customer> GetCustomerById(@PathVariable String id){
		return service.findById(id);
	}
}
