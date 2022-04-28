package com.hope.bibliotech.activities;

import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.hope.bibliotech.R;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.hope.bibliotech.ui.fragments.AccountFragment;
import com.hope.bibliotech.ui.fragments.DownloadsFragment;
import com.hope.bibliotech.ui.fragments.ForumFragment;
import com.hope.bibliotech.ui.fragments.HomeFragment;
import com.hope.bibliotech.ui.fragments.LoginFragment;
import com.hope.bibliotech.ui.fragments.RegisterFragment;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		BottomNavigationView navigation = findViewById(R.id.bottomNavigation);
		navigation.setOnItemSelectedListener(item -> {
			switch (item.getItemId()) {
			case R.id.menu_id_home:
				loadFragment(new HomeFragment());
				break;
			case R.id.menu_id_downloads:
				loadFragment(new DownloadsFragment());
				break;
			case R.id.menu_id_forum:
				loadFragment(new ForumFragment());
				break;
			}
			return true;
		});
		
		loadFragment(new HomeFragment());

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == R.id.menu_id_account) {
			loadFragment(new AccountFragment());
		}
		return super.onOptionsItemSelected(item);
	}

	void loadFragment(Fragment fragment) {
		getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
	}

}
