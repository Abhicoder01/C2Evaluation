package com.masai;

public class Book {

	private Integer bookid;
	private String name;
	private String author;
	private Integer price;
	
	Book(){
		
	}
	Book(int bookid, String name, String author, int price){
		this.bookid=bookid;
		this.name=name;
		this.author=author;
		this.price=price;
	}
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
}
