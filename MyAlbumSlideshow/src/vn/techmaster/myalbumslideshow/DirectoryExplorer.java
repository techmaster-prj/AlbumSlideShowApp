package vn.techmaster.myalbumslideshow;

import java.io.File;
import java.util.ArrayList;

import vn.techmaster.adapter.FilesAdapter;
import vn.techmaster.model.MyFile;
import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class DirectoryExplorer extends Activity {

	private ArrayList<MyFile> directoryList;
	private StringBuffer path;
	private FilesAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_directory_explorer);
		//set width, height dialog activity		
		DisplayMetrics displaymetrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
		int height = displaymetrics.heightPixels -150;
		int width = displaymetrics.widthPixels-150;
		getWindow().setLayout(width, height);
		
		//get gridview
		GridView gvDirectoryExplorer = (GridView) findViewById(R.id.gvDirectoryExplorer);
		
		//get root file sdcard
		String root = Environment.getExternalStorageDirectory().getAbsolutePath();
		path = new StringBuffer();
		path.append(root);
		
		//custom gridview
		directoryList = new ArrayList<MyFile>();
		getDirectoryList(path.toString());
		adapter = new FilesAdapter(this, R.layout.files_layout, directoryList);
		gvDirectoryExplorer.setAdapter(adapter);
		
		gvDirectoryExplorer.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				if(arg2 != 0){
					MyFile selectedFolder = directoryList.get(arg2);
					String folder = selectedFolder.getName();
					//reset array list
					directoryList.clear();
					//add new item
					path.append("/" + folder); 
					getDirectoryList(path.toString());
					adapter.notifyDataSetChanged();
				}else{
					
				}			
			}
		});

	}

	private void getDirectoryList(String path) {		
		File file = new File(path);
		String files[] = file.list();
		//load all folder in path to array list		
		MyFile parent = new MyFile();
		parent.setName(" ... ");
		directoryList.add(parent);
		for (String fileName : files) {	
			MyFile myfile = new MyFile();
			myfile.setName(fileName);
			directoryList.add(myfile);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.directory_explorer, menu);
		return true;
	}

}
