package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Presentation {
    @GetMapping("/books")
	public List<Book> getbooks(@PathVariable("id") int bookid){
		
		List<Book> books=new ArrayList<>();
		books.add(new Book(1,"A","A",500) );
		books.add(new Book(2,"B","B",600) );
		books.add(new Book(3,"C","C",700) );
		books.add(new Book(4,"D","D",800) );
		books.add(new Book(5,"E","E",900) );
		return books;
	}
    
    @GetMapping("/book/{id}")	
    public List<Book> getbooksid(@PathVariable("id") Integer bookid){
		
		List<Book> books=new ArrayList<>();
		books.add(new Book(bookid,"ramayan","tulsidas",500) );
		return books;
    }
    
    @PostMapping(value= "/book",consumes=MediaType.APPLICATION_JSON_VALUE)
    public String postbooks(@RequestBody Book books1) {
    	return "books"+books1;
    	
    }
	
}
