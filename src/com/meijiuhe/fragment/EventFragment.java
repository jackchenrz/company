package com.meijiuhe.fragment;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.meijiuhe.Activity.EventDetailsActivity;
import com.meijiuhe.fangsiba.R;

public class EventFragment extends Fragment {

	private ListView listview;
	
	private List<String> arr;
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_event, container, false);
		listview =(ListView) view.findViewById(R.id.lv_event_frag);
		arr = new ArrayList<String>();
		for (int i = 0; i < 20; i++) {
			arr.add("今夜有你不孤单"+i);
		}
		
		adapter = new MyAdapter();
		listview.setAdapter(adapter);
		listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent intent = new Intent(getActivity(),EventDetailsActivity.class);
				startActivity(intent);
			}
		});
		
		return view;
	}
	
	private MyAdapter adapter;
	public class MyAdapter extends BaseAdapter{

		@Override
		public int getCount() {
			return arr.size();
		}

		@Override
		public Object getItem(int position) {
			return arr.get(position);
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View view = null;
			if (convertView==null) {
				convertView=View.inflate(getActivity(), R.layout.list_item_event,null);
			}else{
				view=convertView;
			}
			
			TextView username = (TextView)convertView.findViewById(R.id.tv_userName);
			username.setText(arr.get(position));
			
			return convertView;
		}
		
		
	}
	
}
