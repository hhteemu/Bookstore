package hh.sof3as3.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import hh.sof3as3.Bookstore.web.BookController;
import hh.sof3as3.Bookstore.web.BooklistController;
import hh.sof3as3.Bookstore.web.CategoryController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class BookstoreApplicationTests {
	
	@Autowired
	private BooklistController booklistController;
	@Autowired
	private CategoryController categoryController;
	@Autowired
	private BookController bookController;

	@Test
	void contextLoads() {
		assertThat(categoryController).isNotNull();
		assertThat(booklistController).isNotNull();
		assertThat(bookController).isNotNull();
		}

}
