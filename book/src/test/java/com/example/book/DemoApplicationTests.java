package com.example.book;


import static org.junit.Assert.assertEquals;

import com.example.book.model.ResponseJson;
import com.example.book.serviceImpl.BookServiceImplementation;

import org.junit.jupiter.api.Test;



class BookServiceImplementationTest {


    @Test
	void should_return_zero_item() {
    	// GIVEN
    	BookServiceImplementation bookServiceImplementation = new BookServiceImplementation();
    	String query = "";
    	//WHEN 
    	ResponseJson result = bookServiceImplementation.search(query);
    	//THEN
    	assertEquals(result.getTotalItems(),0);
 
    	
	}
    
    @Test
	void should_return_ten_items() {
    	// GIVEN
    	BookServiceImplementation bookServiceImplementation = new BookServiceImplementation();
    	String query = "java";
    	//WHEN 
    	ResponseJson result = bookServiceImplementation.search(query);
    	//THEN
    	assertEquals(result.getItems().size(),10);
  	
	}

}
