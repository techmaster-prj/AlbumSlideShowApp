package vn.techmaster.myalbumslideshow;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MyAlbumScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_album_screen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my_album_screen, menu);
		return true;
	}

}