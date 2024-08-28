package Lendi.services.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Lendi.daoRepository.CustomerRepository;
import Lendi.models.Customer;
import Lendi.services.iservices.iCustomerService;
@Service
public class CustomerService implements iCustomerService{
	@Autowired
	
	private CustomerRepository cusRep;
	public List<Customer> GetAll(){
		 
		return (List<Customer>) cusRep.findAll();
	}
	public Optional<Customer> findById(String id){
		 return  cusRep.findById(id);
	}
	



}
