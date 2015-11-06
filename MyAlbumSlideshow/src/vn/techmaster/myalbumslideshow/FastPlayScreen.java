package vn.techmaster.myalbumslideshow;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class FastPlayScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fast_play_screen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fast_play_screen, menu);
		return true;
	}
	
	public void fastPlayScreenOnClick(View v) {
		/* Go to other screen when button clicked */
		int ID = v.getId();
		switch (ID) {

		case R.id.btnChooseIMGFolder:
			Intent i1 = new Intent(FastPlayScreen.this, DirectoryExplorer.class);
			startActivity(i1);
			break;

		case R.id.btnBackgroundMusic:
			
			break;

		case R.id.btnAddEffect:
			
			break;

		case R.id.btnDelayTime:
			
			break;

		case R.id.ibtnSetting:
			
			break;

		case R.id.ibtnPlay:
						
			break;
			
		case R.id.ibtnSave:
			
			break;

		default:
			break;
		}
	}

}
