package com.hope.bibliotech.ui.adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.hope.bibliotech.core.model.Action;
import com.hope.bibliotech.ui.activities.PDFDocumentActivity;
import com.hope.bibliotech.ui.adapter.ListActionsHolder;
import com.hope.bibliotech.ui.fragments.ActionsDialogFragment;
import java.util.List;
import com.hope.bibliotech.R;

public class ListActionsAdapter extends RecyclerView.Adapter<ListActionsHolder> {

	private static final Class PDF_VISUALIZE_ACTIVITY = PDFDocumentActivity.class;
	private List<Action> actionList;
	private ActionsDialogFragment dialog;
	private Intent intent;

	public ListActionsAdapter(ActionsDialogFragment dialog, List<Action> actionList) {
		this.dialog = dialog;
		this.actionList = actionList;
	}

	@Override
	public ListActionsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.action, parent, false);
		return new ListActionsHolder(view);
	}

	@Override
	public void onBindViewHolder(ListActionsHolder holder, int position) {
		Action action = actionList.get(position);
		holder.actionTitle.setText(action.getTitle());
		holder.actionIcon.setImageResource(action.getIcon());
		holder.actionItem.setOnClickListener(item -> {
			Context context = item.getContext();
			switch (position) {
			case 0:
				visualizeDocument(context, PDF_VISUALIZE_ACTIVITY);
				break;
			}
		});
	}

	@Override
	public int getItemCount() {
		return actionList.size();
	}

	void visualizeDocument(Context context, Class clazz) {
		intent = new Intent(context, clazz);
		context.startActivity(intent);
		dialog.dismiss();
	}

}
