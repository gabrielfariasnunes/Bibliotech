package com.hope.bibliotech.core.model;

public class Book {
	private int id;
	private String url;
	public BookDetails details;

	public int getId() {
		return id;
	}

	public String getUrl() {
		return url;
	}
	
	public BookDetails getDetails(){
		return details;
	}	

}
