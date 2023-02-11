package hh.sof3as3.Bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hh.sof3as3.Bookstore.domain.BookRepository;

@Controller
public class BooklistController {
	@Autowired
	private BookRepository repository;
	
	@GetMapping("/booklist")
	public String bookList(Model model) {
		model.addAttribute("books", repository.findAll());
		return "booklist"; //booklist.html
	}
}
