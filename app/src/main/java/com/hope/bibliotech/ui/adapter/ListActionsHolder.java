package com.hope.bibliotech.ui.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hope.bibliotech.R;

public class ListActionsHolder extends RecyclerView.ViewHolder {
	public RelativeLayout actionItem;
	public ImageView actionIcon;
	public TextView actionTitle;

	public ListActionsHolder(View view) {
		super(view);
		actionItem = view.findViewById(R.id.action_item);
		actionTitle = view.findViewById(R.id.action_title);
		actionIcon = view.findViewById(R.id.action_icon);
	}
}
