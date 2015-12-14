package com.meijiuhe.fragment;

import com.meijiuhe.fangsiba.R;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeFragment extends Fragment {

	private View view;
	private TextView tvNews,tvEvent;
	
	@Override
	public View onCreateView(LayoutInflater inflater,
			 ViewGroup container,  Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_home, container, false);
		
		NewsFragment newsFragment = new NewsFragment();
		FragmentTransaction newsTransaction = getFragmentManager().beginTransaction();
		newsTransaction.add(R.id.frameNews, newsFragment);
		newsTransaction.commit();
		
		//调用 初始化 方法
		init();
		
		tvNews.setOnClickListener(onClickListener);
		tvEvent.setOnClickListener(onClickListener);
		
		return view;
	}
	
	//点击事件
	OnClickListener onClickListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			switch (arg0.getId()) {			
			case R.id.news:
				NewsFragment newsFragment = new NewsFragment();
				FragmentTransaction newsTransaction = getFragmentManager().beginTransaction();
				newsTransaction.replace(R.id.frameNews, newsFragment);
				newsTransaction.commit();
				break;
				
			case R.id.event:
				EventFragment eventFragment = new EventFragment();
				FragmentTransaction eventTransaction = getFragmentManager().beginTransaction();
				eventTransaction.replace(R.id.frameNews, eventFragment);
				eventTransaction.commit();
				break;
			default:
				break;
			}
		}
	};

	//初始化
	public void init(){
	tvNews = (TextView)view.findViewById(R.id.news);
	tvEvent = (TextView)view.findViewById(R.id.event);
	}
	
}
