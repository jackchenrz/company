package com.meijiuhe.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public abstract class BasePager {

	protected Context ctx;


	public BasePager(Context ctx){
		this.ctx = ctx;
	}
	
	/**
	 * 初始化view
	 * @return
	 */
	public abstract View initView();
	
	
	/**
	 * 初始化数据
	 */
	public abstract void initData();
	

	
	
}
