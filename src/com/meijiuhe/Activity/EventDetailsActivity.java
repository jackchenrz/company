package com.meijiuhe.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.meijiuhe.fangsiba.R;

public class EventDetailsActivity extends Activity{
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			this.requestWindowFeature(Window.FEATURE_NO_TITLE);
			setContentView(R.layout.list2_item_event);
			
			
			
		//	nihao 
		}
		
		/**
		 * back��ť����¼�
		 * @param v
		 */
		public void back(View v){
			finish();
		}
}
