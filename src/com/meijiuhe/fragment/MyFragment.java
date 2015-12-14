package com.meijiuhe.fragment;

import com.meijiuhe.fangsiba.R;
import com.meijiuhe.my.Attend;
import com.meijiuhe.my.Details;
import com.meijiuhe.my.Dynamic;
import com.meijiuhe.my.MySettings;
import com.meijiuhe.my.Published;
import com.meijiuhe.my.Tag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MyFragment extends Fragment{

	private View view;
	private ImageView imgSetting,imgDetails;
	private RelativeLayout tvPublished,tvAttend,tvDynamic,tvTag;
	
	@Override
	public View onCreateView(LayoutInflater inflater,
			 ViewGroup container, Bundle savedInstanceState) {
		view= inflater.inflate(R.layout.fragment_my, container, false);
		
		//调用初始化方法
		init();
		
		//调用点击事件
		imgSetting.setOnClickListener(onClickListener);
		imgDetails.setOnClickListener(onClickListener);
		tvPublished.setOnClickListener(onClickListener);
		tvAttend.setOnClickListener(onClickListener);
		tvDynamic.setOnClickListener(onClickListener);
		tvTag.setOnClickListener(onClickListener);
		
		return view;
	}
	
	//点击事件
	OnClickListener onClickListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			switch (arg0.getId()) {
			
			case R.id.setting:
				Intent intentSetting = new Intent(getActivity(), MySettings.class);
				startActivity(intentSetting);
				break;
				
			case R.id.headPortrait:
				Intent intentDetails = new Intent(getActivity(), Details.class);
				startActivity(intentDetails);
				break;
				
			case R.id.tv_published:
				Intent intentPublished = new Intent(getActivity(), Published.class);
				startActivity(intentPublished);
				break;
				
			case R.id.tv_attend:
				Intent intentAttend = new Intent(getActivity(), Attend.class);
				startActivity(intentAttend);
				break;
				
			case R.id.tv_dynamic:
				Intent intentDynamic = new Intent(getActivity(), Dynamic.class);
				startActivity(intentDynamic);
				break;
								
			case R.id.tv_tag:
				Intent intentTag = new Intent(getActivity(), Tag.class);
				startActivity(intentTag);
				break;
				
			default:
				break;
			}
		}
	};
	
	//初始化
	public void init(){
		imgSetting = (ImageView)view.findViewById(R.id.setting);
		imgDetails = (ImageView)view.findViewById(R.id.headPortrait);
		tvPublished = (RelativeLayout)view.findViewById(R.id.tv_published);
		tvAttend = (RelativeLayout)view.findViewById(R.id.tv_attend);
		tvDynamic = (RelativeLayout)view.findViewById(R.id.tv_dynamic);		
		tvTag = (RelativeLayout)view.findViewById(R.id.tv_tag);		
	}
	
}
