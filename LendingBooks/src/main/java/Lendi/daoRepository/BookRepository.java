package Lendi.daoRepository;




import org.springframework.data.repository.CrudRepository;

import Lendi.models.Book;;



public interface BookRepository extends CrudRepository<Book,Integer>{
}