package com.meijiuhe.my;

import com.meijiuhe.adapter.MyDynamicBaseAdapter;
import com.meijiuhe.fangsiba.R;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;

public class Dynamic extends Activity {

	private ListView lvDynamic;
	Context mContext;
	private ImageView imgDynBack;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);//取消标题
		setContentView(R.layout.activity_dynamic);
		mContext = this;

		//调用初始化的方法
		init();
		imgDynBack.setOnClickListener(onClickListener);

		MyDynamicBaseAdapter adapter = new MyDynamicBaseAdapter(mContext);
		lvDynamic.setAdapter(adapter);
	}

	OnClickListener onClickListener = new OnClickListener() {

		@Override
		public void onClick(View arg0) {
			switch (arg0.getId()) {
			case R.id.imgDynBack:
				finish();
				break;

			default:
				break;
			}
		}
	};

	//初始化
	public void init(){
		lvDynamic = (ListView)findViewById(R.id.lv_dynamic);
		imgDynBack = (ImageView)findViewById(R.id.imgDynBack);
	}
}
