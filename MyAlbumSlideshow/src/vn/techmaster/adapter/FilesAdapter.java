package vn.techmaster.adapter;

import java.util.ArrayList;
import java.util.List;

import vn.techmaster.model.MyFile;
import vn.techmaster.myalbumslideshow.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class FilesAdapter extends ArrayAdapter<MyFile> {
	
	private LayoutInflater inflater;
	private Context myContext;
	private ArrayList<MyFile> arrayList;

	public FilesAdapter(Context context, int resource, List<MyFile> objects) {
		super(context, resource, objects);
		myContext = context;
		arrayList = (ArrayList<MyFile>) objects;
		inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(convertView == null){
			convertView = inflater.inflate(R.layout.files_layout, null);
		}
		TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
		
		//set value
		String name = arrayList.get(position).getName();
		tvName.setText(name);
		
		return convertView;
	}
}
