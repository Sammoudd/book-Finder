package com.example.book.model;

import java.util.ArrayList;

public class ResponseJson {

	private String kind;
	private int totalItems;
	private ArrayList<Book> items;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getTotalItems() {
		return totalItems;
	}
	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}
	public ArrayList<Book> getItems() {
		return items;
	}
	public void setItems(ArrayList<Book> items) {
		this.items = items;
	}
	
	
	
}
