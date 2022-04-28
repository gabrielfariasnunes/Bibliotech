package com.hope.bibliotech.ui.fragments;

import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.hope.bibliotech.core.model.Action;
import com.hope.bibliotech.ui.adapter.ListActionsAdapter;
import java.util.ArrayList;
import java.util.List;
import com.hope.bibliotech.R;

public class ActionsDialogFragment extends BottomSheetDialogFragment {
	private List<Action> actionList;
	private ListActionsAdapter adapter;
	private RecyclerView recyclerView;

	@Override
	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		actionList = new ArrayList<>();
		actionList.add(new Action(R.drawable.ic_visibility, "Visualizar"));
		actionList.add(new Action(R.drawable.ic_share, "Compartilhar"));
		actionList.add(new Action(R.drawable.ic_favorite, "Favoritar"));
		actionList.add(new Action(R.drawable.ic_download, "Baixar"));
		actionList.add(new Action(R.drawable.ic_info, "Detalhes"));
		adapter = new ListActionsAdapter(this, actionList);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle bundle) {
		String bookTitle = getArguments().getString("title");
		View view = inflater.inflate(R.layout.fragment_actions_dialog, parent, false);
		recyclerView = view.findViewById(R.id.listActions);
		TextView title = view.findViewById(R.id.actionDialogTitle);
		title.setText(bookTitle);
		
		return view;
	}

	@Override
	public void onResume() {
		super.onResume();
		recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
		recyclerView.setAdapter(adapter);
		adapter.notifyDataSetChanged();
	}
}
