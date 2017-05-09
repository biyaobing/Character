package com.itheima.calc;

import android.os.Bundle;
import android.os.SystemClock;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
/*
 * 三个界面
 * 1,第一个界面时开启界面,跳转到第二个界面
 * 2,第二个界面计算人品,得到数据,跳转到第三个界面
 * 3,第三个界面获取数据,并显示,用textView
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
