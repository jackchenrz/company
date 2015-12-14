package com.meijiuhe.fangsiba;

import com.meijiuhe.fragment.HomeFragment;
import com.meijiuhe.fragment.MessageFragment;
import com.meijiuhe.fragment.MyFragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends FragmentActivity{

	private Button btn1,btn2,btn3,btn4;//�±ߵ� tab ��ť
	Context mContext;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);//ȥ��������
        setContentView(R.layout.activity_main);
        mContext = this;
        
        //���ó�ʼ������
        init();
        
        //��� ��ҳ
        HomeFragment home = new HomeFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.framelayout, home);
        transaction.commit();
        
        //���õ���¼�
        btn1.setOnClickListener(onClickListener);
        btn2.setOnClickListener(onClickListener);
        btn3.setOnClickListener(onClickListener);
        btn4.setOnClickListener(onClickListener);
    }
    
    //��ʼ��
    public void init(){
    	btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
    }

    OnClickListener onClickListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			switch (arg0.getId()) {
			
			case R.id.btn1:
				//�滻Ϊ ��ҳ
				HomeFragment home = new HomeFragment();
		        FragmentTransaction homeTransaction = getSupportFragmentManager().beginTransaction();
		        homeTransaction.replace(R.id.framelayout, home);
		        homeTransaction.commit();
				break;
				
			case R.id.btn2:				
				
				break;
				
			case R.id.btn3:
				//�滻Ϊ��Ϣҳ��
				MessageFragment message = new MessageFragment(); 
		        FragmentTransaction messageTransaction = getSupportFragmentManager().beginTransaction();
		        messageTransaction.replace(R.id.framelayout, message);
		        messageTransaction.commit();
				break;
				
			case R.id.btn4:
				//�滻Ϊ��Ϣҳ��
				MyFragment my= new MyFragment();
		        FragmentTransaction myTransaction = getSupportFragmentManager().beginTransaction();
		        myTransaction.replace(R.id.framelayout, my);
		        myTransaction.commit();
				break;
				
			default:
				break;
			}
			
		}
	};
    
}
