package com.meijiuhe.fragment;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import com.meijiuhe.ViewPager.ImagesViewPager;
import com.meijiuhe.ViewPager.RecommendViewPager;
import com.meijiuhe.ViewPager.VideoViewPager;
import com.meijiuhe.fangsiba.R;

public class NewsFragment extends Fragment {
	private View view;
	private TextView tvRecommend,TvVideo,tvImg;
	private ViewPager mViewPager;
	private List<View> pagerList; // Tabҳ���б�

	@Override
	public View onCreateView(LayoutInflater inflater,
			ViewGroup container,  Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_news, container, false);

		//���ó�ʼ������
		init();

		//���õ���¼�
		tvRecommend.setOnClickListener(onClickListener);
		TvVideo.setOnClickListener(onClickListener);
		tvImg.setOnClickListener(onClickListener);

		pagerList = new ArrayList<View>();
		RecommendViewPager  recommendViewPager = new RecommendViewPager(getContext());
		VideoViewPager   videoViewPager = new VideoViewPager(getContext());
		ImagesViewPager imageViewPager = new ImagesViewPager(getContext());
		
		
		pagerList.add(recommendViewPager.initView());
		pagerList.add(videoViewPager.initView());
		pagerList.add(imageViewPager.initView());

		//������
		adapter = new MyAdapter();
		mViewPager.setAdapter(adapter);

		mViewPager.setCurrentItem(0);//Ĭ����ʾ ��һ��ҳ��
		return view;
	}
	
	
	private MyAdapter adapter;
	public class MyAdapter extends PagerAdapter{

		@Override
		public int getCount() {
			return pagerList.size();
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			return arg0==arg1;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			container.removeView((View)object);
			
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			
			container.addView(pagerList.get(position));
			return pagerList.get(position);
		}
		
		
		
	}
	

	//����¼�
	OnClickListener onClickListener = new OnClickListener() {

		@Override
		public void onClick(View arg0) {

			switch (arg0.getId()) {
			case R.id.tvRecommend:
				mViewPager.setCurrentItem(0);
				break;

			case R.id.TvVideo:
				mViewPager.setCurrentItem(1);
				break;

			case R.id.tvImg:
				mViewPager.setCurrentItem(2);
				break;

			default:
				break;
			}
		}
	};

	//��ʼ��
	public void init(){
		tvRecommend = (TextView)view.findViewById(R.id.tvRecommend);
		TvVideo= (TextView)view.findViewById(R.id.TvVideo);
		tvImg = (TextView)view.findViewById(R.id.tvImg);
		mViewPager = (ViewPager)view.findViewById(R.id.pager);
	}

}
	
	/*private View view;
	//private Button btnRecommend,btnVideo,btnImageView;
	private ViewPager mViewPager;
	private List<View> views; // Tabҳ���б�
	private MyPagerAdapter adapter;
	
	 private static final String[] TITLE = new String[] { "�Ƽ�", "��Ƶ", "Ȥͼ"};  
	 
	 
	 
	 private List<BasePager> PagersList;
	@Override
	public View onCreateView(LayoutInflater inflater,
			ViewGroup container,  Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_news, container, false);
		
		//���ó�ʼ������
		init();

		//���õ���¼�
		btnRecommend.setOnClickListener(onClickListener);
		btnVideo.setOnClickListener(onClickListener);
		btnImageView.setOnClickListener(onClickListener);

		views = new ArrayList<View>();
		LayoutInflater mInflater = getLayoutInflater(savedInstanceState);
		views.add(mInflater.inflate(R.layout.viewpager_recommend, null));
		views.add(mInflater.inflate(R.layout.viewpager_video, null));
		views.add(mInflater.inflate(R.layout.viewpager_images, null));

		//������
		adapter = new MyPagerAdapter( getActivity(), views);
		mViewPager.setAdapter(adapter);

		mViewPager.setCurrentItem(0);//Ĭ����ʾ ��һ��ҳ��
		
		mViewPager = (ViewPager) view.findViewById(R.id.pager);
		final FragmentPagerAdapter adapter = new TabPageIndicatorAdapter(getFragmentManager());  
		mViewPager.setAdapter(adapter); 
		
		TabPageIndicator indicator = (TabPageIndicator)view.findViewById(R.id.indicator);  
        indicator.setViewPager(mViewPager);
		
        
        PagersList = new ArrayList<BasePager>();
        PagersList.add(new RecommendViewPager(getActivity()));
        PagersList.add(new VideoViewPager(getActivity()));
        PagersList.add(new ImagesViewPager(getActivity()));
        
        mViewPager.setCurrentItem(0);
        System.out.println("����newsFragment����");
        
		indicator.setOnPageChangeListener(new OnPageChangeListener() {
			
			@Override
			public void onPageSelected(int position) {
				BasePager basepager =PagersList.get(position);
				basepager.initData();
				adapter.notifyDataSetChanged();
			}
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				
			}
		});
		
		return view;
	}

public class TabPageIndicatorAdapter extends FragmentPagerAdapter{
	
	@Override
	public CharSequence getPageTitle(int position) {
		return TITLE[position];
	}

	public TabPageIndicatorAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int arg0) {
		Fragment fragment = PagersList.get(arg0);    
        return fragment;  
	}

	@Override
	public int getCount() {
		return TITLE.length;
	}
	
}


	//����¼�
	OnClickListener onClickListener = new OnClickListener() {

		@Override
		public void onClick(View arg0) {

			switch (arg0.getId()) {
			case R.id.recommendbtn:
				mViewPager.setCurrentItem(0);
				break;

			case R.id.videobtn:
				mViewPager.setCurrentItem(1);
				break;

			case R.id.imgbtn:
				mViewPager.setCurrentItem(2);
				break;

			default:
				break;
			}
		}
	};

	//��ʼ��
	public void init(){
		btnRecommend = (Button)view.findViewById(R.id.recommendbtn);
		btnVideo= (Button)view.findViewById(R.id.videobtn);
		btnImageView = (Button)view.findViewById(R.id.imgbtn);
		mViewPager = (ViewPager)view.findViewById(R.id.pager);
	}

}
*/