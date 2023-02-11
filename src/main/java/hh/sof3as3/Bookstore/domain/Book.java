package hh.sof3as3.Bookstore.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; //Automatically generated id
	private String title, author;
	private int publishingYear, isbn;
	private double price;

	public Book() {
		super();
		this.title = null;
		this.author = null;
		this.publishingYear = 0;
		this.isbn = 0;
		this.price = 0;
	}

	public Book(String title, String author, int year, int isbn, double price) {
		super();
		this.title = title;
		this.author = author;
		this.publishingYear = year;
		this.isbn = isbn;
		this.price = price;
	}

	//Getters
	public long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return publishingYear;
	}

	public int getIsbn() {
		return isbn;
	}

	public double getPrice() {
		return price;
	}

	//Setters
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setYear(int year) {
		this.publishingYear = year;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//ToString
	@Override
	public String toString() {
		return "id=" + id + "title=" + title + ", author=" + author + ", year=" + publishingYear + ", isbn=" + isbn + ", price=" + price;
	}
	
	
	
}
