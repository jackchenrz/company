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
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);//ȥ��������
		setContentView(R.layout.activity_details);
		
		//���ó�ʼ������
		init();
		
		imgDetBack.setOnClickListener(onClickListener);
	}
	
	//����¼�
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

	//��ʼ��
	public void init(){
		imgDetBack = (ImageView)findViewById(R.id.imgDetBack);
	}
	
}
