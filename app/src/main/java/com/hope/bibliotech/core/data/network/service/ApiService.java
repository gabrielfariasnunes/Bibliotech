package com.hope.bibliotech.core.data.network.service;

import com.hope.bibliotech.core.model.Book;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
	@GET("/books")
	public Call<List<Book>> getAllBooks();
}