package hh.sof3as3.Bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import hh.sof3as3.Bookstore.domain.Category;
import hh.sof3as3.Bookstore.domain.CategoryRepository;

@Controller
public class CategoryController {
	@Autowired
	private CategoryRepository repository;
	
	@GetMapping("/categories")
	public String categoryList(Model model) {
		model.addAttribute("categories", repository.findAll());
		return "categorylist"; //categorylist.html
	}
	
	//Adding a category'
	@GetMapping("/addcategory")
	public String addCategory(Model model) {
		model.addAttribute("category", new Category());
		return "addcategory"; //addcategory.html
	}
	
	//Saving a category
	@PostMapping("/savecategory")
	public String saveBook(Category category) {
		repository.save(category);
		return "redirect:categories"; //categories.html
	}

}
