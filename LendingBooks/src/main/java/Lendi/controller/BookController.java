package Lendi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import Lendi.models.Book;
import Lendi.services.iservices.iBookService;

import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:2000", "http://localhost:2001"})//זה קשור רק לחיבור לקליינט

@RestController
public class BookController {

	@Autowired

	private iBookService service;

	
	 @GetMapping("/books")
	 public List<Book> getAllBooks(){
		 return service.GetAll();
	 }
	 
	 @GetMapping("/books/{id}")
	 public Optional<Book> getBookById(@PathVariable int id){
		 return service.findById(id);
	 } 
	 
	 @GetMapping("/bookByName")
	 public List<Book> searchBook(@RequestBody String nameBook){
		 return service.searchBook(nameBook);
	 } 
	 
	@PostMapping("/addBook")

	public Boolean addBook(@RequestBody Book b) {

		return service.addBook(b);

	}

	



}
