package Lendi.daoRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import Lendi.models.Lending;

 public interface LendingRepository extends CrudRepository<Lending,Integer>{
	 @Query("SELECT l, b, c FROM Lending l JOIN Book b ON l.bookId = b.id JOIN Customer c ON l.customerId = c.id")
	    List<Object[]> findAllLendingsWithBookAndCustomerInfo();
}
