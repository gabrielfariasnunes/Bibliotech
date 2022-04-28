package com.hope.bibliotech.core.model;

import java.util.List;

public class BookDetails {
	private String title;
	private String thumbnail;
	private String author;
	private int size;
	private String publishedDate;
	private String releaseDate;
	private List<BookCategory> categories;

	public String getTitle() {
		return title;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public String getPublishedDate() {
		return publishedDate;

	}

	public String getAuthor() {
		return author;
	}

	public int getSize() {
		return size;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public List<BookCategory> getCategories() {
		return categories;
	}

}
