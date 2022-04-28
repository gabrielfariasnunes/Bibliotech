package com.hope.bibliotech.ui.adapter;

import com.hope.bibliotech.R;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hope.bibliotech.core.model.Book;
import com.hope.bibliotech.core.model.BookCategory;
import com.hope.bibliotech.core.model.BookDetails;
import com.hope.bibliotech.ui.adapter.ListBooksHolder;
import com.hope.bibliotech.ui.fragments.ActionsDialogFragment;
import java.util.List;

public class ListBooksAdapter extends RecyclerView.Adapter<ListBooksHolder> {

	private static final String TAG = "ListBooksAdapter";
	private static final String EXTRA_TITLE = "title";
	private List<Book> bookList;
	private FragmentManager fragmentManager;

	public ListBooksAdapter(List<Book> bookList, FragmentManager fragmentManager) {
		this.bookList = bookList;
		this.fragmentManager = fragmentManager;
	}

	@Override
	public ListBooksHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book, parent, false);
		return new ListBooksHolder(view);
	}

	@Override
	public void onBindViewHolder(ListBooksHolder holder, int position) {
		Book book = bookList.get(position);
		String title = book.details.getTitle();
		String author = book.details.getAuthor();
		String publishedDate = book.details.getPublishedDate();
		String size = String.format("%s MB", book.details.getSize() / 1024);
		String categorie = book.details.getCategories().get(0).getName();

		holder.title.setText(title);
		holder.author.setText(author);
		holder.size.setText(size);
		holder.categorie.setText(categorie);
		holder.cardView.setOnClickListener(view -> showBottomDialog(title));
	}

	@Override
	public int getItemCount() {
		return bookList.size();
	}

	void showBottomDialog(String title) {
		Bundle bundle = new Bundle();
		bundle.putString(EXTRA_TITLE, title);
		ActionsDialogFragment dialogFragment = new ActionsDialogFragment();
		dialogFragment.setArguments(bundle);
		dialogFragment.show(fragmentManager, TAG);
	}

}
