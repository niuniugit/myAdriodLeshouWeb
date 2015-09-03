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
	//�û����ı��༭��
	private EditText username;
	//�����ı��༭��
	private EditText password;
	//��¼��ť
	private Button btnLogin;
	//ע�ᰴť
	private Button btnRegiser;
	//ȡ����ť
	private Button btnReset;
	//����Intent����,������������Activity
	private Intent intent;
	//��д�ķ���������һ��Activityʱ���˷������Զ�����
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //���ò���
        setContentView(R.layout.activity_android_login);
        //�õ���¼��ť����
        btnLogin = (Button)findViewById(R.id.userlogin);
        //����¼��ť���ü�����
        btnLogin.setOnClickListener(oclLogin);
        
      //�õ�ע�ᰴť����
        btnRegiser = (Button)findViewById(R.id.btnregister);
        //��ע�ᰴť���ü�����
        btnRegiser.setOnClickListener(oclRegiser);
        
      //�õ���¼��ť����
        btnReset = (Button)findViewById(R.id.btnReset);
        //����¼��ť���ü�����
        btnReset.setOnClickListener(oclReset);
    }
    //������¼��ť����������
    OnClickListener oclLogin = new OnClickListener(){
		public void onClick(View arg0) {
			//�õ��û���������ı༭��
			username = (EditText)findViewById(R.id.username);
			password = (EditText)findViewById(R.id.password);
			//�ж��û�������û����������Ƿ������õ�ֵ��ͬ,����Ҫ��toString()
			if("zhangsan".equals(username.getText().toString())&& 
					"123456".equals(password.getText().toString())){
				System.out.println("�����˰�ť");
				//����Intent���󣬴���ԴActivity��Ŀ��Activity�������
				intent = new Intent(AndroidLoginActivity.this, LoginSuccessActivity.class);
				//����Activitys
				startActivity(intent);
			}else{
				//��¼��Ϣ����ͨ��Toast��ʾ��ʾ��Ϣ
				Toast.makeText(AndroidLoginActivity.this,"�û����������" , Toast.LENGTH_SHORT).show();
			}
		}
    };
    
    //����ע�ᰴť����������
    OnClickListener oclRegiser = new OnClickListener(){
		public void onClick(View arg0) {
				//����Intent���󣬴���ԴActivity��Ŀ��Activity�������
				intent = new Intent(AndroidLoginActivity.this, RegisterActivity.class);
				//����Activitys
				startActivity(intent);		
		}
    };
    
    //����ȡ����ť����������
    OnClickListener oclReset = new OnClickListener(){
		public void onClick(View arg0) {			
				//����Intent���󣬴���ԴActivity��Ŀ��Activity�������
				intent = new Intent(AndroidLoginActivity.this, MainActivity.class);
				//����Activitys
				startActivity(intent);
		}
    };
}
