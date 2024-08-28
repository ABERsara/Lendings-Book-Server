package Lendi.daoRepository;

import org.springframework.data.repository.CrudRepository;

import Lendi.models.Customer;



public interface CustomerRepository extends CrudRepository<Customer,String>{

}
