package com.hope.bibliotech.ui.fragments;

import android.view.View;
import android.os.Bundle;
import com.hope.bibliotech.R;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;

public class DownloadsFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle arg2) {
		return inflater.inflate(R.layout.fragment_downloads, parent, false);
	}
}
