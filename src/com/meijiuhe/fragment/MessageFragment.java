package com.meijiuhe.fragment;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.meijiuhe.adapter.MyMessageBaseAdapter;
import com.meijiuhe.fangsiba.R;

public class MessageFragment extends Fragment {

	private View view;
    private ListView lv_message;

	private List<String> MyList ;
	
	@Override
	public View onCreateView(LayoutInflater inflater,
			ViewGroup container,  Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_message, container, false);
		lv_message = (ListView)view.findViewById(R.id.lv_message);

		MyList = new ArrayList<String>();
		for (int i = 0; i < 20; i++) {
			MyList.add("我是"+i);
		}
		//调用消息界面的 适配器
		MyMessageBaseAdapter adapter = new MyMessageBaseAdapter(getActivity(), MyList);
		lv_message.setAdapter(adapter);

		return view;
	}

}
