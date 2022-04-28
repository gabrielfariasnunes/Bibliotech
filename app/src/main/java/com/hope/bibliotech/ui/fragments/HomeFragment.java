package com.hope.bibliotech.ui.fragments;

import android.content.Context;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.google.android.material.snackbar.Snackbar;
import com.hope.bibliotech.core.data.network.ApiHttp;
import com.hope.bibliotech.core.data.network.service.ApiService;
import com.hope.bibliotech.core.model.Book;
import com.hope.bibliotech.core.model.BookDetails;
import com.hope.bibliotech.ui.adapter.ListBooksAdapter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import com.hope.bibliotech.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment {
	private ListBooksAdapter adapter;
    private List<Book> bookList;
	@Override
	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		bookList = new ArrayList<>();
		adapter = new ListBooksAdapter(bookList, getParentFragmentManager());
		ApiHttp.service().getAllBooks().enqueue(new Callback<List<Book>>() {
			@Override
			public void onResponse(Call<List<Book>> call, Response<List<Book>> response) {
				if(response.isSuccessful()){
					for(Book book: response.body()){
						bookList.add(book);
					}
					adapter.notifyDataSetChanged();
				}
			}
			@Override
			public void onFailure(Call<List<Book>> call, Throwable error) {
				Snackbar.make(getContext(), getView(), error.getMessage(), Snackbar.ANIMATION_MODE_SLIDE).show();
			}

		});
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle bundle) {

		View view = inflater.inflate(R.layout.fragment_home, parent, false);
		RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
		recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
		recyclerView.setAdapter(adapter);
		return view;
	}

}
