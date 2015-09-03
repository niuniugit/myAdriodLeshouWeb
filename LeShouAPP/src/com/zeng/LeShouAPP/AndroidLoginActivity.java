package com.zeng.LeShouAPP;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AndroidLoginActivity extends Activity {
	//用户名文本编辑框
	private EditText username;
	//密码文本编辑框
	private EditText password;
	//登录按钮
	private Button btnLogin;
	//注册按钮
	private Button btnRegiser;
	//取消按钮
	private Button btnReset;
	//定义Intent对象,用来连接两个Activity
	private Intent intent;
	//重写的方法，启动一个Activity时，此方法会自动调用
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置布局
        setContentView(R.layout.activity_android_login);
        //得到登录按钮对象
        btnLogin = (Button)findViewById(R.id.userlogin);
        //给登录按钮设置监听器
        btnLogin.setOnClickListener(oclLogin);
        
      //得到注册按钮对象
        btnRegiser = (Button)findViewById(R.id.btnregister);
        //给注册按钮设置监听器
        btnRegiser.setOnClickListener(oclRegiser);
        
      //得到登录按钮对象
        btnReset = (Button)findViewById(R.id.btnReset);
        //给登录按钮设置监听器
        btnReset.setOnClickListener(oclReset);
    }
    //创建登录按钮监听器对象
    OnClickListener oclLogin = new OnClickListener(){
		public void onClick(View arg0) {
			//得到用户名和密码的编辑框
			username = (EditText)findViewById(R.id.username);
			password = (EditText)findViewById(R.id.password);
			//判断用户输入的用户名和密码是否与设置的值相同,必须要有toString()
			if("zhangsan".equals(username.getText().toString())&& 
					"123456".equals(password.getText().toString())){
				System.out.println("你点击了按钮");
				//创建Intent对象，传入源Activity和目的Activity的类对象
				intent = new Intent(AndroidLoginActivity.this, LoginSuccessActivity.class);
				//启动Activitys
				startActivity(intent);
			}else{
				//登录信息错误，通过Toast显示提示信息
				Toast.makeText(AndroidLoginActivity.this,"用户或密码错误" , Toast.LENGTH_SHORT).show();
			}
		}
    };
    
    //创建注册按钮监听器对象
    OnClickListener oclRegiser = new OnClickListener(){
		public void onClick(View arg0) {
				//创建Intent对象，传入源Activity和目的Activity的类对象
				intent = new Intent(AndroidLoginActivity.this, RegisterActivity.class);
				//启动Activitys
				startActivity(intent);		
		}
    };
    
    //创建取消按钮监听器对象
    OnClickListener oclReset = new OnClickListener(){
		public void onClick(View arg0) {			
				//创建Intent对象，传入源Activity和目的Activity的类对象
				intent = new Intent(AndroidLoginActivity.this, MainActivity.class);
				//启动Activitys
				startActivity(intent);
		}
    };
}
