package com.hope.bibliotech.ui.activities;

import android.os.Bundle;
import android.view.Menu;
import androidx.appcompat.app.AppCompatActivity;
import com.hope.bibliotech.R;

public class PDFDocumentActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		setContentView(R.layout.activity_document);
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.pdf_visualize_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}
}
