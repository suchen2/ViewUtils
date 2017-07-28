package com.it.hei;

import com.example.myviewutils.OnClick;
import com.example.myviewutils.ViewInject;
import com.example.myviewutils.ViewUtils;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@ViewInject(R.id.tv1)
	private TextView tv1;
	
	@ViewInject(R.id.tv2)
	private TextView tv2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ViewUtils.inject(this);
		Log.d("程序员2","修改了一行代码");
	}

	@OnClick({R.id.btn1,R.id.btn2})
	public void k(View v){
		switch (v.getId()) {
		case R.id.btn1:
			Toast.makeText(this, "btn1:"+tv1.getText(), Toast.LENGTH_SHORT).show();
			break;

		case R.id.btn2:
			Toast.makeText(this, "btn2:"+tv2.getText(), Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}
	}
	
}
