package com.meijiuhe.my;

import com.meijiuhe.fangsiba.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class Details extends Activity {

	private ImageView imgDetBack;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
		setContentView(R.layout.activity_details);
		
		//调用初始化方法
		init();
		
		imgDetBack.setOnClickListener(onClickListener);
	}
	
	//点击事件
	OnClickListener onClickListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			switch (arg0.getId()) {
			case R.id.imgDetBack:
				finish();
				break;

			default:
				break;
			}
		}
	};

	//初始化
	public void init(){
		imgDetBack = (ImageView)findViewById(R.id.imgDetBack);
	}
	
}
