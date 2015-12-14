package com.meijiuhe.adapter;

import com.meijiuhe.fangsiba.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class MyPubshedBaseAdapter extends BaseAdapter {

	Context mContext;
		
	public MyPubshedBaseAdapter(Context mContext) {
		super();
		this.mContext = mContext;
	}

	@Override
	public int getCount() {
		return 5;
	}

	@Override
	public Object getItem(int arg0) {
		return arg0;
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		convertView = LayoutInflater.from(mContext).inflate(R.layout.listview_published, null);
		
		return convertView;
	}

}
