package com.zeng.LeShouAPP;


import android.app.Activity;
import android.os.Bundle;

/**
 * 登录成功后，显示的Activity
 */
public class LoginSuccessActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//设置布局
		setContentView(R.layout.activity_android_login_success);
	}
}
