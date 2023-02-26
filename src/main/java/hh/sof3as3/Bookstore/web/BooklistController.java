package hh.sof3as3.Bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import hh.sof3as3.Bookstore.domain.Book;
import hh.sof3as3.Bookstore.domain.BookRepository;
import hh.sof3as3.Bookstore.domain.CategoryRepository;

@Controller
public class BooklistController {
	@Autowired
	private BookRepository repository;
	@Autowired
	private CategoryRepository crepository;
	
	@GetMapping("/booklist")
	public String bookList(Model model) {
		model.addAttribute("books", repository.findAll());
		return "booklist"; //booklist.html
	}
	
	//Deleting a book from a database
	@GetMapping("deletebook/{id}")
	public String deleteBook(@PathVariable("id") Long bookId, Model model) {
		repository.deleteById(bookId);
		return "redirect:../booklist"; //booklist.html
	}
	
	//Editing a book
	@GetMapping("editbook/{id}")
	public String editBook(@PathVariable("id") Long bookId, Model model) {
		model.addAttribute("book", repository.findById(bookId));
		return "/editbook"; //editbook.html
	}
	
	
	//Adding a book
	@GetMapping("/addbook")
	public String addBook(Model model) {
		model.addAttribute("book", new Book());
		model.addAttribute("categories", crepository.findAll());
		return "addbook"; //addbook.html
	}
	
	//Saving a book
	@PostMapping("/savebook")
	public String saveBook(Book book) {
		repository.save(book);
		return "redirect:booklist"; //booklist.html
	}
}
