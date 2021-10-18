package com.example.book.service;

import com.example.book.model.Book;
import com.example.book.model.ResponseJson;

public interface BookService {

	public ResponseJson search(String query);
	
	public Book findBookById(String id);
}
