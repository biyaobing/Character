package com.itheima.calc;

import android.os.Bundle;
import android.os.SystemClock;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
/*
 * ��������
 * 1,��һ������ʱ��������,��ת���ڶ�������
 * 2,�ڶ������������Ʒ,�õ�����,��ת������������
 * 3,�����������ȡ����,����ʾ,��textView
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        new Thread(new Runnable() {
			
			@Override
			public void run() {
				SystemClock.sleep(1000);
				
				Intent intent = new Intent(MainActivity.this, SecondActivity.class);
			     startActivity(intent);
			     finish();
				
			}
		}).start();
    }
    
}
