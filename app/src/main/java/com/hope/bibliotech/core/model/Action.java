package com.hope.bibliotech.core.model;

public class Action {
	private int icon;
	private String title;
	

	public Action(int icon, String title) {
		this.icon = icon;
		this.title = title;
	}

	public int getIcon() {
		return icon;
	}

	public String getTitle() {
		return title;
	}
}
