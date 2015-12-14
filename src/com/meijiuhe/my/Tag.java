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
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);//ȡ������
		setContentView(R.layout.activity_tag);
		
		//���ó�ʼ������
		init();
		
		tvTagCancle.setOnClickListener(onClickListener);
		
	}	
	
	//����¼�
	OnClickListener onClickListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			switch (arg0.getId()) {
			case R.id.tvTagCancel:
				finish();//����ǹؼ� 
				break;

			default:
				break;
			}
			
		}
	};
	
	//��ʼ������
	public void init(){
		tvTagCancle = (TextView)findViewById(R.id.tvTagCancel);
	}
}
