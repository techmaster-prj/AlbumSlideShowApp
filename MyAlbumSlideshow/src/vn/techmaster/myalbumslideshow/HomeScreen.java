package vn.techmaster.myalbumslideshow;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class HomeScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_screen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home_screen, menu);
		return true;
	}

	public void homeScreenOnClick(View v) {
		/* Go to other screen when button clicked */
		int ID = v.getId();
		switch (ID) {

		case R.id.btnFastPlay:
			Intent i1 = new Intent(HomeScreen.this, FastPlayScreen.class);
			startActivity(i1);
			break;

		case R.id.btnMyAlbum:
			Intent i2 = new Intent(HomeScreen.this, MyAlbumScreen.class);
			startActivity(i2);
			break;

		case R.id.btnCreateAlbum:
			Intent i3 = new Intent(HomeScreen.this, CreateAlbumScreen.class);
			startActivity(i3);
			break;

		case R.id.btnSharedAlbum:
			Intent i4 = new Intent(HomeScreen.this, SharedAlbumScreen.class);
			startActivity(i4);
			break;

		case R.id.btnInformation:
			Intent i5 = new Intent(HomeScreen.this, InformationScreen.class);
			startActivity(i5);
			break;

		case R.id.btnExit:
			//alert dialog before exit
			
			//exit
			finish();			
			break;

		default:
			break;
		}
	}

}
