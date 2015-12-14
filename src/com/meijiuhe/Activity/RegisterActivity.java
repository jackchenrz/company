package com.meijiuhe.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;

import com.meijiuhe.fangsiba.R;

public class RegisterActivity extends Activity{
		private ImageView iv_back;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			requestWindowFeature(Window.FEATURE_NO_TITLE);
			setContentView(R.layout.activity_register);
			
			iv_back = (ImageView) findViewById(R.id.iv_back);
			iv_back.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					finish();
				}
			});
		}
		
		
		/**
		 * 完成按钮的点击事件
		 * @param v
		 */
		public void register(View v){
			Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
			startActivity(intent);
		}
}
