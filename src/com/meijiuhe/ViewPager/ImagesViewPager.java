package com.meijiuhe.ViewPager;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

public class ImagesViewPager extends BasePager{

	public ImagesViewPager(Context context) {
		super(context);
	}
	
	@Override
	public View initView() {
		
		TextView textView = new TextView(ctx);
		textView.setText("Œ“ «»§Õº“≥√Ê.... ");
		return textView;
	}

	@Override
	public void initData() {
	}
	
}
