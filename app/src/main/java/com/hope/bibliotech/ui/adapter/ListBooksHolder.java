package com.hope.bibliotech.ui.adapter;

import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.textview.MaterialTextView;
import com.hope.bibliotech.ui.fragments.ActionsDialogFragment;
import com.hope.bibliotech.R;

public class ListBooksHolder extends RecyclerView.ViewHolder {
	public CardView cardView;
	public MaterialTextView title;
	public MaterialTextView publishedDate;
	public MaterialTextView author;
	public MaterialTextView size;
	public MaterialTextView categorie;
	
	public ListBooksHolder(View view) {
		super(view);
		cardView = view.findViewById(R.id.bookCard);
		title = view.findViewById(R.id.book_title);
		publishedDate = view.findViewById(R.id.book_date);
		author = view.findViewById(R.id.book_author);
		size = view.findViewById(R.id.book_size);
		categorie = view.findViewById(R.id.book_category);
		
	}
}
