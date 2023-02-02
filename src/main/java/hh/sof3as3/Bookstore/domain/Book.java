package hh.sof3as3.Bookstore.domain;

public class Book {

	private String title;
	private String author;
	private int year;
	private int isbn;
	private double price;

	public Book() {
		super();
		this.title = null;
		this.author = null;
		this.year = 0;
		this.isbn = 0;
		this.price = 0;
	}

	public Book(String title, String author, int year, int isbn, double price) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
		this.price = price;
	}

	//Getters
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}

	public int getIsbn() {
		return isbn;
	}

	public double getPrice() {
		return price;
	}

	//Setters
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setYear(int year) {
		this.year = year;
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
		return "title=" + title + ", author=" + author + ", year=" + year + ", isbn=" + isbn + ", price=" + price;
	}
	
	
	
}
