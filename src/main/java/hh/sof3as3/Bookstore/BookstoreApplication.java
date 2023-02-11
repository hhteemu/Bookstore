package hh.sof3as3.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.sof3as3.Bookstore.domain.Book;
import hh.sof3as3.Bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	//CommandLineRunner that adds test data to database
	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {
			Book b1 = new Book("To Kill A Mockingbird", "Harper Lee", 1960, 7896430, 10.90);
			Book b2 = new Book("Frankenstein", "Mary Shelley", 1818, 7897722, 7.90);
			Book b3 = new Book("Animal Farm", "George Orwell", 1945, 7899874, 9.90);
			
			repository.save(b1);
			repository.save(b2);
			repository.save(b3);
		};
	}
}
