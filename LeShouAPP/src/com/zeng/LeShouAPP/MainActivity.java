package com.zeng.LeShouAPP;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity
{

	private LinearLayout mGallery;
	private int[] mImgIds;
	private LayoutInflater mInflater;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		mInflater = LayoutInflater.from(this);
		initData();
		initView();

	}

	private void initData()
	{
		mImgIds = new int[] { R.drawable.homepagead01,R.drawable.news,R.drawable.main};
	}

	private void initView()
	{
		mGallery = (LinearLayout) findViewById(R.id.id_gallery);

		for (int i = 0; i < mImgIds.length; i++)
		{
			
			View view = mInflater.inflate(R.layout.main,
					mGallery, false);
			ImageView img = (ImageView) view
					.findViewById(R.id.iv01);
			img.setImageResource(mImgIds[i]);
			TextView txt = (TextView) view
					.findViewById(R.id.tv01);
			txt.setText("some info ");
			mGallery.addView(view);
		}
	}
}

