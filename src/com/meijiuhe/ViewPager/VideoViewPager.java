package com.meijiuhe.ViewPager;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

public class VideoViewPager extends BasePager{

	public VideoViewPager(Context ctx) {
		super(ctx);
	}
	
	
	@Override
	public View initView() {
		TextView textView = new TextView(ctx);
		textView.setText("������Ƶҳ�� ......");
		return textView;
	}

	@Override
	public void initData() {
		
	}

}
