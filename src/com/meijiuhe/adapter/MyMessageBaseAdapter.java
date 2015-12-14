package com.meijiuhe.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.meijiuhe.fangsiba.R;

public class MyMessageBaseAdapter extends BaseAdapter{

	Context mContext;	
	private List<String> MyList ;
	
	public MyMessageBaseAdapter(Context mContext, List<String> myList) {
		super();
		this.mContext = mContext;
		MyList = myList;
	}

	@Override
	public int getCount() {
		return MyList.size();
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		ViewHolder holder;
		
		if(convertView == null){
			convertView = LayoutInflater.from(mContext).inflate(R.layout.listview_message, null);
			holder = new ViewHolder();
			holder.imgHead  = (ImageView)convertView.findViewById(R.id.img_head);
			holder.tvNameUser = (TextView)convertView.findViewById(R.id.tv_nameuser);
			holder.tvMessage = (TextView)convertView.findViewById(R.id.tv_messageuser);
			convertView.setTag(holder);
		}else{
			holder = (ViewHolder) convertView.getTag();
		}
		
		holder.tvNameUser.setText("小蜜");
		holder.tvMessage.setText("明天去哪嗨!");
		
		return convertView;
	}
	
	public class ViewHolder{
		ImageView imgHead ;
		TextView tvNameUser;
		TextView tvMessage;
	}

}
