package com.meijiuhe.ViewPager;

import com.meijiuhe.fangsiba.R;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

public class RecommendViewPager extends BasePager{
	

	public RecommendViewPager(Context ctx) {
		super(ctx);
	}

	@Override
	public View initView() {
		View view = View.inflate(ctx, R.layout.viewpager_recommend, null);
		
		
		
		
		return view;
	}

	@Override
	public void initData() {
		
	}

	

}
