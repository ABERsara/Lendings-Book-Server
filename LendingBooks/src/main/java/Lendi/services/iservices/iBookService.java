package Lendi.services.iservices;


import java.util.List;
import java.util.Optional;

import Lendi.models.Book;



public interface iBookService {
//לקבל את כל הספרים
	List<Book> GetAll();
	//שליפת ספר ע"פ קוד
	Optional<Book> findById(int id);
	//חיפוש ספר לפי שם 
	List<Book> searchBook(String nameBook);
	//הוספת ספר
boolean addBook(Book book);
}
