package hh.sof3as3.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import hh.sof3as3.Bookstore.domain.Book;
import hh.sof3as3.Bookstore.domain.BookRepository;
import hh.sof3as3.Bookstore.domain.Category;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class BookRepositoryTest {

	@Autowired
	private BookRepository repository;
	
	@Test
	public void findByIdShouldReturnBook(){
		List<Book> books = repository.findByAuthor("Harper Lee");
		assertThat(books).hasSize(1);
		assertThat(books.get(0).getTitle()).isEqualTo("To Kill A Mockingbird");
	}
	
	@Test
	public void createNewBook() {
		Category c1 = new Category("Testikategoria");
		Book book = new Book("Testi", "Testi", 2023, 132323, 12.90, c1);
		repository.save(book);
		assertThat(book.getId()).isNotNull();
	}
	
	@Test
	public void deleteBook() {
		int repositoryLength = (int) repository.count();
		Category c1 = new Category("Testikategoria");
		Book book = new Book("Testi", "Testi", 2023, 132323, 12.90, c1);
		repository.save(book);
		assertThat(book.getId()).isNotNull();
		repository.delete(book);
		assertThat((int) repository.count()).isEqualTo(repositoryLength);
	}
}
