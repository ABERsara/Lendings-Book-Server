package Lendi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Lendi.models.Lending;
import Lendi.services.iservices.iLendingService;

@CrossOrigin(origins = {"http://localhost:2000", "http://localhost:2001"})//זה קשור רק לחיבור לקליינט

@RestController
public class LendingController {
	@Autowired
	private iLendingService service;
		
		@GetMapping("/lendings")
		public List<Object[]> GetAllLendings(){
			return service.getAllLendingsWithBookAndCustomerInfo();
		}
		
		@PostMapping("/addLending")
		public boolean  addLending(@RequestBody Lending lending) {
			return service.addLending(lending);
		}
		
		@PutMapping("/updateReturned/{id}")
		public boolean updateReturned(@PathVariable int id) {
			return service.updateReturned(id);
		}
}
