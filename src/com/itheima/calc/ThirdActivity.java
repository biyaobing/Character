package com.itheima.calc;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends Activity {
	private TextView tv_result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		tv_result = (TextView) findViewById(R.id.tv_result);
		
		String result = getIntent().getStringExtra(getPackageName() + ".result"); 
		tv_result.setText(result);
		
	}
}
