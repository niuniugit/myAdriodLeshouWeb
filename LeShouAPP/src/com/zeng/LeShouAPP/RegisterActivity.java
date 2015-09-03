package com.zeng.LeShouAPP;

import com.zeng.LeShouAPP.Utils.MobileUtils;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
/**
 * 注册Activity
 */
public class RegisterActivity extends Activity {
	//用户名文本编辑框 其实就是电话号码
	private EditText etMobile; 
	//手机验证码文本编辑框
	private EditText etVerificationCode;
	//密码文本编辑框
	private EditText etPassword;
	//确认密码文本编辑框
	private EditText etConfirmPassword;
	//登录按钮
	private Button btnRegister;
	//定义Intent对象,用来连接两个Activity
	private Intent intent;
	//重写的方法，启动一个Activity时，此方法会自动调用
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置布局
        setContentView(R.layout.register);
        //得到登录按钮对象
        btnRegister = (Button)findViewById(R.id.register);
        //给登录按钮设置监听器
        btnRegister.setOnClickListener(oclRegister);
    }
    //创建登录按钮监听器对象
    OnClickListener oclRegister = new OnClickListener(){
		public void onClick(View arg0) {
			   //得到用户名和密码的编辑框
			   etMobile = (EditText)findViewById(R.id.etMobile);
			   etVerificationCode = (EditText)findViewById(R.id.etVerificationCode);
			   etPassword = (EditText)findViewById(R.id.etpassword);
			   etConfirmPassword = (EditText)findViewById(R.id.etConfirmPassword);
			   if(MobileUtils.isMobileNumber(etMobile.toString())){
				   if(etPassword.toString().equals(etConfirmPassword.toString()) ){
						//传入数据库的
						//创建Intent对象，传入源Activity和目的Activity的类对象
						intent = new Intent(RegisterActivity.this, LoginSuccessActivity.class);
						//启动Activity
						startActivity(intent);		
					}else{
						Toast.makeText(RegisterActivity.this,"密码两次输入不一致" , Toast.LENGTH_SHORT).show();
					}
			   }else{
				   Toast.makeText(RegisterActivity.this,"请输入正确的手机号" , Toast.LENGTH_SHORT).show();
			   }			 
		}
    };
}
