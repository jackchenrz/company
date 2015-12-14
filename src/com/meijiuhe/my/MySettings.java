package com.meijiuhe.my;


import com.meijiuhe.fangsiba.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class MySettings extends Activity {

	private ImageView imgMySetBack;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);//ȥ��������
		setContentView(R.layout.activity_mysettings);

		//���ó�ʼ������
		init();

		imgMySetBack.setOnClickListener(onClickListener);
	}

	//����¼�
	OnClickListener onClickListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			switch (arg0.getId()) {
			case R.id.imgMySetBack:
				finish();
				break;

			default:
				break;
			}
		}
	};
	
	//��ʼ��
	public void init(){
		imgMySetBack = (ImageView)findViewById(R.id.imgMySetBack);
	}
	
}
