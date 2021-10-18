package com.example.book.service;

import com.example.book.model.Book;
import com.example.book.model.ResponseJson;

public interface BookService {

	/**
	 * Get jsonResponse from the google Api by query.
	 * 
	 * @param query
	 * @return ResponseJson
	 */
	public ResponseJson search(String query);

}
