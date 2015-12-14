package com.meijiuhe.my;

import com.meijiuhe.adapter.MyAttendBaseAdapter;
import com.meijiuhe.fangsiba.R;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ListView;

public class Attend extends Activity {

	private ListView lvAttend;
	Context mContext;
	private ImageView imgAttendBack;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去标题
		setContentView(R.layout.activity_attend);
		mContext = this;
		
		//调用初始化的方法
		init();
		
		imgAttendBack.setOnClickListener(onClickListener);
		
		MyAttendBaseAdapter adapter = new MyAttendBaseAdapter(mContext);
		lvAttend.setAdapter(adapter);
	}

	OnClickListener onClickListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			switch (arg0.getId()) {
			case R.id.imgAttendBack:
				finish();
				break;

			default:
				break;
			}
		}
	};
	
	//初始化
	public void init(){
		lvAttend = (ListView)findViewById(R.id.lv_attend);
		imgAttendBack = (ImageView)findViewById(R.id.imgAttendBack);
	}
}
