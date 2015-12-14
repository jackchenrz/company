package com.meijiuhe.my;

import com.meijiuhe.adapter.MyPubshedBaseAdapter;
import com.meijiuhe.fangsiba.R;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ListView;

public class Published extends Activity {

	private ListView lvPublished;
	Context mContext;
	private ImageView imgPublishedBack;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题
		setContentView(R.layout.activity_published);
		mContext = this;
		
		//调用初始化方法
		init();
		
		imgPublishedBack.setOnClickListener(onClickListener);
		
		MyPubshedBaseAdapter adapter = new MyPubshedBaseAdapter(mContext);
		lvPublished.setAdapter(adapter);
		
		
	}
	
	//点击事件
	OnClickListener onClickListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			switch (arg0.getId()) {
			case R.id.imgPublishedBack:
				finish();
				break;

			default:
				break;
			}
		}
	};
	
	//初始化
	public void init(){
		lvPublished = (ListView)findViewById(R.id.lv_published);
		imgPublishedBack = (ImageView)findViewById(R.id.imgPublishedBack);
	}
	
}
