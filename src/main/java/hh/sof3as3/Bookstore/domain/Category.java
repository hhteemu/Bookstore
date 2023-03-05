package hh.sof3as3.Bookstore.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long categoryId; //Automatically generated id
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
	@JsonIgnoreProperties("category")
	private List<Book> books;
	
	public Category() {
		super();
		this.name = null;
	}
	
	public Category (String name) {
		super();
		this.name = name;
	}

	//Getters
	public String getName() {
		return name;
	}
	
	public List<Book> getBooks(){
		return books;
	}
	
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", name=" + name + "]";
	}
}
