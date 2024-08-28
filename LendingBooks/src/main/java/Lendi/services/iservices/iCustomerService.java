package Lendi.services.iservices;

import java.util.List;
import java.util.Optional;

import Lendi.models.Customer;

public interface iCustomerService {
	//לקבל את כל הלקוחות
		List<Customer> GetAll();
		//שליפת לקוח לפי ת.ז.
		Optional<Customer> findById(String id);

}
