package com.example.book.model;


public class VolumeInfo {
	
	private String title;
	private String subtitle;
	private String[] authors;
	private String publisher;
	private String publishedDate;
	private String description;
	private ImageLinks imageLinks;

	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String[] getAuthors() {
		return authors;
	}
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public ImageLinks getImageLinks() {
		return imageLinks;
	}
	public void setImageLinks(ImageLinks imageLinks) {
		this.imageLinks = imageLinks;
	}
	

}
