package hh.sof3as3.Bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

	@GetMapping("/index")
	public String getBooks(){
		return "welcome"; //welcome.html
	}
}

