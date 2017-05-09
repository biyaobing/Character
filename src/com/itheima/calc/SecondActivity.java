package com.itheima.calc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
/*
 * 计算人品
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
		
		
		//将name编程byte字节数组
				byte[] bytes = name.getBytes();
				int count = 0;
				for (byte b : bytes) {
					//将b转换为正数  b & 0xff
					count += Math.abs(b);
				}
				//保证count在100以内
				count = count%100;
				
				String result = "姓名:"+name+"\n"+"人品得分:"+count+"\n"+"人品:";
				if(count>90){
					result += "人品超级好";
				}else if (count>60) {
					result += "人品很好";
					
				}else if (count>30) {
					
					result += "人品一般";
				}else if (count>=0) {
					result += "不要和我谈人品";
				}
				
				Intent intent = new Intent(this, ThirdActivity.class);
				intent.putExtra(getPackageName() + ".result", result);
				startActivity(intent);
	}
}
