package hh.sof3as3.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.sof3as3.Bookstore.domain.Book;
import hh.sof3as3.Bookstore.domain.BookRepository;
import hh.sof3as3.Bookstore.domain.Category;
import hh.sof3as3.Bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	//CommandLineRunner that adds test data to database
	@Bean
	public CommandLineRunner demo(BookRepository brepository, CategoryRepository crepository) {
		return (args) -> {
			//Adding a few books as a test data
			Book b1 = new Book("To Kill A Mockingbird", "Harper Lee", 1960, 7896430, 10.90);
			Book b2 = new Book("Frankenstein", "Mary Shelley", 1818, 7897722, 7.90);
			Book b3 = new Book("Animal Farm", "George Orwell", 1945, 7899874, 9.90);
			
			brepository.save(b1);
			brepository.save(b2);
			brepository.save(b3);
			
			//Adding a few categories as a test data
			Category c1 = new Category("Horror");
			Category c2 = new Category("Fantasy");
			Category c3 = new Category("Sci-fi");
			
			crepository.save(c1);
			crepository.save(c2);
			crepository.save(c3);
		};
	}
}
