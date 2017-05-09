package com.itheima.calc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
/*
 * ������Ʒ
 * 
 */
public class SecondActivity extends Activity {
	private EditText et_name;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		et_name = (EditText) findViewById(R.id.et_name);
	}
	
	public void click(View v) {
		String name = et_name.getText().toString().trim();
		if(TextUtils.isEmpty(name)) {
			return ;
		}
		
		
		//��name���byte�ֽ�����
				byte[] bytes = name.getBytes();
				int count = 0;
				for (byte b : bytes) {
					//��bת��Ϊ����  b & 0xff
					count += Math.abs(b);
				}
				//��֤count��100����
				count = count%100;
				
				String result = "����:"+name+"\n"+"��Ʒ�÷�:"+count+"\n"+"��Ʒ:";
				if(count>90){
					result += "��Ʒ������";
				}else if (count>60) {
					result += "��Ʒ�ܺ�";
					
				}else if (count>30) {
					
					result += "��Ʒһ��";
				}else if (count>=0) {
					result += "��Ҫ����̸��Ʒ";
				}
				
				Intent intent = new Intent(this, ThirdActivity.class);
				intent.putExtra(getPackageName() + ".result", result);
				startActivity(intent);
	}
}
