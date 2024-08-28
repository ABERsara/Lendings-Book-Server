package Lendi.services.services;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Lendi.services.iservices.iBookService;
import Lendi.daoRepository.BookRepository;
import Lendi.models.Book;

@Service
public class BookService implements iBookService {
    @Autowired

	private BookRepository bookRep;

	// לקבל את כל הספרים
	public List<Book> GetAll() {
		List<Book> bookList = (List<Book>) bookRep.findAll();
		return bookList;
	}

	public Optional<Book> findById(int id){
		List<Book> allBooks = GetAll();
		return  allBooks.stream()

				.filter(existingBook -> existingBook.getId()==id).findFirst();
	}

	// חיפוש ספר לפי שם

public List<Book> searchBook(String nameBook) {

// קבל את כל הספרים מהמאגר

List<Book> allBooks =GetAll();



// רשימה שתכיל את הספרים התואמים

List<Book> matchingBooks = new ArrayList<>();



// השתמש ב-Stream כדי לסנן את הספרים עם השם המתאים ולהוסיף אותם לרשימה החדשה

allBooks.stream()

        .filter(book -> book.getNameBook().equals(nameBook))

        .forEach(matchingBooks::add);



return matchingBooks;

}




	@Override

	public boolean addBook(Book book) {

		// קבל את כל הספרים מהמאגר

		List<Book> allBooks = GetAll();

		// בדוק אם קיים ספר עם אותו שם

		boolean bookExists = allBooks.stream()

				.anyMatch(existingBook -> existingBook.getNameBook().equals(book.getNameBook()));

		if (bookExists) {

			return false; // אם הספר קיים, החזר false

		}

		// הוסף את הספר למאגר

		bookRep.save(book);

		return true; // אם הספר לא קיים והוסף אותו, החזר true

	}


}
