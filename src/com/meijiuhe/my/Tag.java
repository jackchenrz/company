package com.meijiuhe.my;

import com.meijiuhe.fangsiba.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class Tag extends Activity {

	private TextView tvTagCancle;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);//取消标题
		setContentView(R.layout.activity_tag);
		
		//调用初始化方法
		init();
		
		tvTagCancle.setOnClickListener(onClickListener);
		
	}	
	
	//点击事件
	OnClickListener onClickListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			switch (arg0.getId()) {
			case R.id.tvTagCancel:
				finish();//这个是关键 
				break;

			default:
				break;
			}
			
		}
	};
	
	//初始化方法
	public void init(){
		tvTagCancle = (TextView)findViewById(R.id.tvTagCancel);
	}
}
