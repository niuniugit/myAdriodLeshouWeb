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
 * ע��Activity
 */
public class RegisterActivity extends Activity {
	//�û����ı��༭�� ��ʵ���ǵ绰����
	private EditText etMobile; 
	//�ֻ���֤���ı��༭��
	private EditText etVerificationCode;
	//�����ı��༭��
	private EditText etPassword;
	//ȷ�������ı��༭��
	private EditText etConfirmPassword;
	//��¼��ť
	private Button btnRegister;
	//����Intent����,������������Activity
	private Intent intent;
	//��д�ķ���������һ��Activityʱ���˷������Զ�����
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //���ò���
        setContentView(R.layout.register);
        //�õ���¼��ť����
        btnRegister = (Button)findViewById(R.id.register);
        //����¼��ť���ü�����
        btnRegister.setOnClickListener(oclRegister);
    }
    //������¼��ť����������
    OnClickListener oclRegister = new OnClickListener(){
		public void onClick(View arg0) {
			   //�õ��û���������ı༭��
			   etMobile = (EditText)findViewById(R.id.etMobile);
			   etVerificationCode = (EditText)findViewById(R.id.etVerificationCode);
			   etPassword = (EditText)findViewById(R.id.etpassword);
			   etConfirmPassword = (EditText)findViewById(R.id.etConfirmPassword);
			   if(MobileUtils.isMobileNumber(etMobile.toString())){
				   if(etPassword.toString().equals(etConfirmPassword.toString()) ){
						//�������ݿ��
						//����Intent���󣬴���ԴActivity��Ŀ��Activity�������
						intent = new Intent(RegisterActivity.this, LoginSuccessActivity.class);
						//����Activity
						startActivity(intent);		
					}else{
						Toast.makeText(RegisterActivity.this,"�����������벻һ��" , Toast.LENGTH_SHORT).show();
					}
			   }else{
				   Toast.makeText(RegisterActivity.this,"��������ȷ���ֻ���" , Toast.LENGTH_SHORT).show();
			   }			 
		}
    };
}
