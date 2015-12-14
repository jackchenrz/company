package com.meijiuhe.my;

import com.meijiuhe.fangsiba.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class Release extends Activity {

	private ImageView imgRelBack;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去标题
		setContentView(R.layout.activity_my_release);
		
		//调用 初始化方法
		init();
		
		imgRelBack.setOnClickListener(onClickListener);
	}
	
	OnClickListener onClickListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			switch (arg0.getId()) {
			case R.id.imgRelBack:
				finish();
				break;

			default:
				break;
			}
		}
	};
	
	//初始化
	public void init(){
		imgRelBack = (ImageView)findViewById(R.id.imgRelBack);
	}
	
}
